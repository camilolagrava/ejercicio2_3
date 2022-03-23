package factoryDevice;

public class FactoryDevice {


        public static IDevice make(String devideType,String directoryApp, String app){
            IDevice device;

            switch (devideType.toLowerCase()){
                case "android":
                    device= new Android(directoryApp, app);
                    break;
                case "ios":
                    device= new Ios();
                    break;
                default:
                    device= new WindowsPhone();
                    break;
            }
            return device;
        }
    }

