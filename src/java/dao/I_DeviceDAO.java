/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Device;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public interface I_DeviceDAO {
    Device getDevice(int deviceId);
    
    ArrayList<Device> getAllDevice();
    
    int createDevice(String deviceName, String deviceDetailDesc);
}
