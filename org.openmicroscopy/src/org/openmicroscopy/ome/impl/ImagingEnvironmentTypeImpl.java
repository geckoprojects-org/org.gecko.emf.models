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
package org.openmicroscopy.ome.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openmicroscopy.ome.ImagingEnvironmentType;
import org.openmicroscopy.ome.Map;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.UnitsPressure;
import org.openmicroscopy.ome.UnitsTemperature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Environment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.ImagingEnvironmentTypeImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImagingEnvironmentTypeImpl#getAirPressure <em>Air Pressure</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImagingEnvironmentTypeImpl#getAirPressureUnit <em>Air Pressure Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImagingEnvironmentTypeImpl#getCO2Percent <em>CO2 Percent</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImagingEnvironmentTypeImpl#getHumidity <em>Humidity</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImagingEnvironmentTypeImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImagingEnvironmentTypeImpl#getTemperatureUnit <em>Temperature Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingEnvironmentTypeImpl extends MinimalEObjectImpl.Container implements ImagingEnvironmentType {
	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected Map map;

	/**
	 * The default value of the '{@link #getAirPressure() <em>Air Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirPressure()
	 * @generated
	 * @ordered
	 */
	protected static final float AIR_PRESSURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAirPressure() <em>Air Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirPressure()
	 * @generated
	 * @ordered
	 */
	protected float airPressure = AIR_PRESSURE_EDEFAULT;

	/**
	 * This is true if the Air Pressure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean airPressureESet;

	/**
	 * The default value of the '{@link #getAirPressureUnit() <em>Air Pressure Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirPressureUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsPressure AIR_PRESSURE_UNIT_EDEFAULT = UnitsPressure.MBAR1;

	/**
	 * The cached value of the '{@link #getAirPressureUnit() <em>Air Pressure Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirPressureUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsPressure airPressureUnit = AIR_PRESSURE_UNIT_EDEFAULT;

	/**
	 * This is true if the Air Pressure Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean airPressureUnitESet;

	/**
	 * The default value of the '{@link #getCO2Percent() <em>CO2 Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCO2Percent()
	 * @generated
	 * @ordered
	 */
	protected static final float CO2_PERCENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCO2Percent() <em>CO2 Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCO2Percent()
	 * @generated
	 * @ordered
	 */
	protected float cO2Percent = CO2_PERCENT_EDEFAULT;

	/**
	 * This is true if the CO2 Percent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cO2PercentESet;

	/**
	 * The default value of the '{@link #getHumidity() <em>Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumidity()
	 * @generated
	 * @ordered
	 */
	protected static final float HUMIDITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHumidity() <em>Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumidity()
	 * @generated
	 * @ordered
	 */
	protected float humidity = HUMIDITY_EDEFAULT;

	/**
	 * This is true if the Humidity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean humidityESet;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final float TEMPERATURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected float temperature = TEMPERATURE_EDEFAULT;

	/**
	 * This is true if the Temperature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean temperatureESet;

	/**
	 * The default value of the '{@link #getTemperatureUnit() <em>Temperature Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsTemperature TEMPERATURE_UNIT_EDEFAULT = UnitsTemperature.C;

	/**
	 * The cached value of the '{@link #getTemperatureUnit() <em>Temperature Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsTemperature temperatureUnit = TEMPERATURE_UNIT_EDEFAULT;

	/**
	 * This is true if the Temperature Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean temperatureUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingEnvironmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getImagingEnvironmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map getMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(Map newMap, NotificationChain msgs) {
		Map oldMap = map;
		map = newMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__MAP, oldMap, newMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMap(Map newMap) {
		if (newMap != map) {
			NotificationChain msgs = null;
			if (map != null)
				msgs = ((InternalEObject)map).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGING_ENVIRONMENT_TYPE__MAP, null, msgs);
			if (newMap != null)
				msgs = ((InternalEObject)newMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGING_ENVIRONMENT_TYPE__MAP, null, msgs);
			msgs = basicSetMap(newMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__MAP, newMap, newMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAirPressure() {
		return airPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAirPressure(float newAirPressure) {
		float oldAirPressure = airPressure;
		airPressure = newAirPressure;
		boolean oldAirPressureESet = airPressureESet;
		airPressureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE, oldAirPressure, airPressure, !oldAirPressureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAirPressure() {
		float oldAirPressure = airPressure;
		boolean oldAirPressureESet = airPressureESet;
		airPressure = AIR_PRESSURE_EDEFAULT;
		airPressureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE, oldAirPressure, AIR_PRESSURE_EDEFAULT, oldAirPressureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAirPressure() {
		return airPressureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsPressure getAirPressureUnit() {
		return airPressureUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAirPressureUnit(UnitsPressure newAirPressureUnit) {
		UnitsPressure oldAirPressureUnit = airPressureUnit;
		airPressureUnit = newAirPressureUnit == null ? AIR_PRESSURE_UNIT_EDEFAULT : newAirPressureUnit;
		boolean oldAirPressureUnitESet = airPressureUnitESet;
		airPressureUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE_UNIT, oldAirPressureUnit, airPressureUnit, !oldAirPressureUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAirPressureUnit() {
		UnitsPressure oldAirPressureUnit = airPressureUnit;
		boolean oldAirPressureUnitESet = airPressureUnitESet;
		airPressureUnit = AIR_PRESSURE_UNIT_EDEFAULT;
		airPressureUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE_UNIT, oldAirPressureUnit, AIR_PRESSURE_UNIT_EDEFAULT, oldAirPressureUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAirPressureUnit() {
		return airPressureUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCO2Percent() {
		return cO2Percent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCO2Percent(float newCO2Percent) {
		float oldCO2Percent = cO2Percent;
		cO2Percent = newCO2Percent;
		boolean oldCO2PercentESet = cO2PercentESet;
		cO2PercentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__CO2_PERCENT, oldCO2Percent, cO2Percent, !oldCO2PercentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCO2Percent() {
		float oldCO2Percent = cO2Percent;
		boolean oldCO2PercentESet = cO2PercentESet;
		cO2Percent = CO2_PERCENT_EDEFAULT;
		cO2PercentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__CO2_PERCENT, oldCO2Percent, CO2_PERCENT_EDEFAULT, oldCO2PercentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCO2Percent() {
		return cO2PercentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getHumidity() {
		return humidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumidity(float newHumidity) {
		float oldHumidity = humidity;
		humidity = newHumidity;
		boolean oldHumidityESet = humidityESet;
		humidityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__HUMIDITY, oldHumidity, humidity, !oldHumidityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHumidity() {
		float oldHumidity = humidity;
		boolean oldHumidityESet = humidityESet;
		humidity = HUMIDITY_EDEFAULT;
		humidityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__HUMIDITY, oldHumidity, HUMIDITY_EDEFAULT, oldHumidityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHumidity() {
		return humidityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperature(float newTemperature) {
		float oldTemperature = temperature;
		temperature = newTemperature;
		boolean oldTemperatureESet = temperatureESet;
		temperatureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__TEMPERATURE, oldTemperature, temperature, !oldTemperatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTemperature() {
		float oldTemperature = temperature;
		boolean oldTemperatureESet = temperatureESet;
		temperature = TEMPERATURE_EDEFAULT;
		temperatureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__TEMPERATURE, oldTemperature, TEMPERATURE_EDEFAULT, oldTemperatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTemperature() {
		return temperatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsTemperature getTemperatureUnit() {
		return temperatureUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperatureUnit(UnitsTemperature newTemperatureUnit) {
		UnitsTemperature oldTemperatureUnit = temperatureUnit;
		temperatureUnit = newTemperatureUnit == null ? TEMPERATURE_UNIT_EDEFAULT : newTemperatureUnit;
		boolean oldTemperatureUnitESet = temperatureUnitESet;
		temperatureUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__TEMPERATURE_UNIT, oldTemperatureUnit, temperatureUnit, !oldTemperatureUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTemperatureUnit() {
		UnitsTemperature oldTemperatureUnit = temperatureUnit;
		boolean oldTemperatureUnitESet = temperatureUnitESet;
		temperatureUnit = TEMPERATURE_UNIT_EDEFAULT;
		temperatureUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.IMAGING_ENVIRONMENT_TYPE__TEMPERATURE_UNIT, oldTemperatureUnit, TEMPERATURE_UNIT_EDEFAULT, oldTemperatureUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTemperatureUnit() {
		return temperatureUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__MAP:
				return basicSetMap(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__MAP:
				return getMap();
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE:
				return getAirPressure();
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE_UNIT:
				return getAirPressureUnit();
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__CO2_PERCENT:
				return getCO2Percent();
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__HUMIDITY:
				return getHumidity();
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__TEMPERATURE:
				return getTemperature();
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__TEMPERATURE_UNIT:
				return getTemperatureUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__MAP:
				setMap((Map)newValue);
				return;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE:
				setAirPressure((Float)newValue);
				return;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE_UNIT:
				setAirPressureUnit((UnitsPressure)newValue);
				return;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__CO2_PERCENT:
				setCO2Percent((Float)newValue);
				return;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__HUMIDITY:
				setHumidity((Float)newValue);
				return;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__TEMPERATURE:
				setTemperature((Float)newValue);
				return;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__TEMPERATURE_UNIT:
				setTemperatureUnit((UnitsTemperature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__MAP:
				setMap((Map)null);
				return;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE:
				unsetAirPressure();
				return;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE_UNIT:
				unsetAirPressureUnit();
				return;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__CO2_PERCENT:
				unsetCO2Percent();
				return;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__HUMIDITY:
				unsetHumidity();
				return;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__TEMPERATURE:
				unsetTemperature();
				return;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__TEMPERATURE_UNIT:
				unsetTemperatureUnit();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__MAP:
				return map != null;
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE:
				return isSetAirPressure();
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE_UNIT:
				return isSetAirPressureUnit();
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__CO2_PERCENT:
				return isSetCO2Percent();
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__HUMIDITY:
				return isSetHumidity();
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__TEMPERATURE:
				return isSetTemperature();
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE__TEMPERATURE_UNIT:
				return isSetTemperatureUnit();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (airPressure: ");
		if (airPressureESet) result.append(airPressure); else result.append("<unset>");
		result.append(", airPressureUnit: ");
		if (airPressureUnitESet) result.append(airPressureUnit); else result.append("<unset>");
		result.append(", cO2Percent: ");
		if (cO2PercentESet) result.append(cO2Percent); else result.append("<unset>");
		result.append(", humidity: ");
		if (humidityESet) result.append(humidity); else result.append("<unset>");
		result.append(", temperature: ");
		if (temperatureESet) result.append(temperature); else result.append("<unset>");
		result.append(", temperatureUnit: ");
		if (temperatureUnitESet) result.append(temperatureUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ImagingEnvironmentTypeImpl
