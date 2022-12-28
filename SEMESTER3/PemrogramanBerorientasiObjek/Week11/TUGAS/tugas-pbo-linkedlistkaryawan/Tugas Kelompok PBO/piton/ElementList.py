class ElementList:
    #Constructor
    def __init__(self):
        self.next = None
        self.__info = None
            
    def setData(self,info):
        self.__info = info
    
    def getData(self):
        return self.__info
