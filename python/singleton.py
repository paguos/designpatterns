class Singleton:
    """
    A non-thread-safe helper class to ease implementing singletons.
    This should be used as a decorator -- not a metaclass -- to the
    class that should be a singleton.

    The decorated class can define one `__init__` function that
    takes only the `self` argument. Also, the decorated class cannot be
    inherited from. Other than that, there are no restrictions that apply
    to the decorated class.

    To get the singleton instance, use the `Instance` method. Trying
    to use `__call__` will result in a `TypeError` being raised.

    """

    def __init__(self, decorated):
        self._decorated = decorated

    def Instance(self):
        """
        Returns the singleton instance. Upon its first call, it creates a
        new instance of the decorated class and calls its `__init__` method.
        On all subsequent calls, the already created instance is returned.

        """
        try:
            return self._instance
        except AttributeError:
            self._instance = self._decorated()
            return self._instance

    def __call__(self):
        raise TypeError('Singletons must be accessed through `Instance()`.')

    def __instancecheck__(self, inst):
        return isinstance(inst, self._decorated)

@Singleton
class Logger:
    
    def log_withdraw(self, account, amount):
        with open('demo_log.txt', 'a') as file:
            file.write(f'WITHDRAW ({account}): {amount} $\n')
            
    def log_deposit(self, account, amount):
        with open('demo_log.txt', 'a') as file:
            file.write(f'DEPOSIT ({account}): {amount} $\n')

    def log_transfer(self, from_account, to_account,amount):
        with open('demo_log.txt', 'a') as file:
            file.write(f'TRANSFER ({from_account} -> {to_account}): {amount} $\n')

logger1 = Logger.Instance()
logger2 = Logger.Instance()
logger3 = Logger.Instance()

logger1.log_deposit('0001', 124)
logger2.log_withdraw("0002", 100)
logger1.log_transfer("0001", "0003", 40)
logger3.log_deposit("0004", 56.74)
logger2.log_withdraw("0005", 30)