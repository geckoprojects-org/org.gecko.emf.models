/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.openmicroscopy.ome;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Environment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.ImagingEnvironmentType#getMap <em>Map</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImagingEnvironmentType#getAirPressure <em>Air Pressure</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImagingEnvironmentType#getAirPressureUnit <em>Air Pressure Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImagingEnvironmentType#getCO2Percent <em>CO2 Percent</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImagingEnvironmentType#getHumidity <em>Humidity</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImagingEnvironmentType#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImagingEnvironmentType#getTemperatureUnit <em>Temperature Unit</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getImagingEnvironmentType()
 * @model extendedMetaData="name='ImagingEnvironment_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ImagingEnvironmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(Map)
	 * @see org.openmicroscopy.ome.OMEPackage#getImagingEnvironmentType_Map()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Map' namespace='##targetNamespace'"
	 * @generated
	 */
	Map getMap();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Map value);

	/**
	 * Returns the value of the '<em><b>Air Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             AirPressure is the define units.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Air Pressure</em>' attribute.
	 * @see #isSetAirPressure()
	 * @see #unsetAirPressure()
	 * @see #setAirPressure(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getImagingEnvironmentType_AirPressure()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='AirPressure'"
	 * @generated
	 */
	float getAirPressure();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getAirPressure <em>Air Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Pressure</em>' attribute.
	 * @see #isSetAirPressure()
	 * @see #unsetAirPressure()
	 * @see #getAirPressure()
	 * @generated
	 */
	void setAirPressure(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getAirPressure <em>Air Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAirPressure()
	 * @see #getAirPressure()
	 * @see #setAirPressure(float)
	 * @generated
	 */
	void unsetAirPressure();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getAirPressure <em>Air Pressure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Air Pressure</em>' attribute is set.
	 * @see #unsetAirPressure()
	 * @see #getAirPressure()
	 * @see #setAirPressure(float)
	 * @generated
	 */
	boolean isSetAirPressure();

	/**
	 * Returns the value of the '<em><b>Air Pressure Unit</b></em>' attribute.
	 * The default value is <code>"mbar"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsPressure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The units the AirPressure is in - default:millibars[mbar].
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Air Pressure Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsPressure
	 * @see #isSetAirPressureUnit()
	 * @see #unsetAirPressureUnit()
	 * @see #setAirPressureUnit(UnitsPressure)
	 * @see org.openmicroscopy.ome.OMEPackage#getImagingEnvironmentType_AirPressureUnit()
	 * @model default="mbar" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='AirPressureUnit'"
	 * @generated
	 */
	UnitsPressure getAirPressureUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getAirPressureUnit <em>Air Pressure Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Pressure Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsPressure
	 * @see #isSetAirPressureUnit()
	 * @see #unsetAirPressureUnit()
	 * @see #getAirPressureUnit()
	 * @generated
	 */
	void setAirPressureUnit(UnitsPressure value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getAirPressureUnit <em>Air Pressure Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAirPressureUnit()
	 * @see #getAirPressureUnit()
	 * @see #setAirPressureUnit(UnitsPressure)
	 * @generated
	 */
	void unsetAirPressureUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getAirPressureUnit <em>Air Pressure Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Air Pressure Unit</em>' attribute is set.
	 * @see #unsetAirPressureUnit()
	 * @see #getAirPressureUnit()
	 * @see #setAirPressureUnit(UnitsPressure)
	 * @generated
	 */
	boolean isSetAirPressureUnit();

	/**
	 * Returns the value of the '<em><b>CO2 Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Carbon Dioxide concentration around the sample [units:none]
	 *             A fraction, as a value from 0.0 to 1.0.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CO2 Percent</em>' attribute.
	 * @see #isSetCO2Percent()
	 * @see #unsetCO2Percent()
	 * @see #setCO2Percent(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getImagingEnvironmentType_CO2Percent()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PercentFraction"
	 *        extendedMetaData="kind='attribute' name='CO2Percent'"
	 * @generated
	 */
	float getCO2Percent();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getCO2Percent <em>CO2 Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO2 Percent</em>' attribute.
	 * @see #isSetCO2Percent()
	 * @see #unsetCO2Percent()
	 * @see #getCO2Percent()
	 * @generated
	 */
	void setCO2Percent(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getCO2Percent <em>CO2 Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCO2Percent()
	 * @see #getCO2Percent()
	 * @see #setCO2Percent(float)
	 * @generated
	 */
	void unsetCO2Percent();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getCO2Percent <em>CO2 Percent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>CO2 Percent</em>' attribute is set.
	 * @see #unsetCO2Percent()
	 * @see #getCO2Percent()
	 * @see #setCO2Percent(float)
	 * @generated
	 */
	boolean isSetCO2Percent();

	/**
	 * Returns the value of the '<em><b>Humidity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Humidity around the sample [units:none]
	 *             A fraction, as a value from 0.0 to 1.0.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Humidity</em>' attribute.
	 * @see #isSetHumidity()
	 * @see #unsetHumidity()
	 * @see #setHumidity(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getImagingEnvironmentType_Humidity()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PercentFraction"
	 *        extendedMetaData="kind='attribute' name='Humidity'"
	 * @generated
	 */
	float getHumidity();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getHumidity <em>Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Humidity</em>' attribute.
	 * @see #isSetHumidity()
	 * @see #unsetHumidity()
	 * @see #getHumidity()
	 * @generated
	 */
	void setHumidity(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getHumidity <em>Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHumidity()
	 * @see #getHumidity()
	 * @see #setHumidity(float)
	 * @generated
	 */
	void unsetHumidity();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getHumidity <em>Humidity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Humidity</em>' attribute is set.
	 * @see #unsetHumidity()
	 * @see #getHumidity()
	 * @see #setHumidity(float)
	 * @generated
	 */
	boolean isSetHumidity();

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The Temperature is the define units.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #isSetTemperature()
	 * @see #unsetTemperature()
	 * @see #setTemperature(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getImagingEnvironmentType_Temperature()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='Temperature'"
	 * @generated
	 */
	float getTemperature();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #isSetTemperature()
	 * @see #unsetTemperature()
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTemperature()
	 * @see #getTemperature()
	 * @see #setTemperature(float)
	 * @generated
	 */
	void unsetTemperature();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getTemperature <em>Temperature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Temperature</em>' attribute is set.
	 * @see #unsetTemperature()
	 * @see #getTemperature()
	 * @see #setTemperature(float)
	 * @generated
	 */
	boolean isSetTemperature();

	/**
	 * Returns the value of the '<em><b>Temperature Unit</b></em>' attribute.
	 * The default value is <code>"\u00b0C"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsTemperature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The units the Temperature is in - default:Celsius[°C].
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temperature Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsTemperature
	 * @see #isSetTemperatureUnit()
	 * @see #unsetTemperatureUnit()
	 * @see #setTemperatureUnit(UnitsTemperature)
	 * @see org.openmicroscopy.ome.OMEPackage#getImagingEnvironmentType_TemperatureUnit()
	 * @model default="\u00b0C" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='TemperatureUnit'"
	 * @generated
	 */
	UnitsTemperature getTemperatureUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getTemperatureUnit <em>Temperature Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsTemperature
	 * @see #isSetTemperatureUnit()
	 * @see #unsetTemperatureUnit()
	 * @see #getTemperatureUnit()
	 * @generated
	 */
	void setTemperatureUnit(UnitsTemperature value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getTemperatureUnit <em>Temperature Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTemperatureUnit()
	 * @see #getTemperatureUnit()
	 * @see #setTemperatureUnit(UnitsTemperature)
	 * @generated
	 */
	void unsetTemperatureUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getTemperatureUnit <em>Temperature Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Temperature Unit</em>' attribute is set.
	 * @see #unsetTemperatureUnit()
	 * @see #getTemperatureUnit()
	 * @see #setTemperatureUnit(UnitsTemperature)
	 * @generated
	 */
	boolean isSetTemperatureUnit();

} // ImagingEnvironmentType
