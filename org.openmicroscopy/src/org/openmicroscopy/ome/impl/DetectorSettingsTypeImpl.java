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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openmicroscopy.ome.Binning;
import org.openmicroscopy.ome.DetectorSettingsType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.UnitsElectricPotential;
import org.openmicroscopy.ome.UnitsFrequency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detector Settings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorSettingsTypeImpl#getBinning <em>Binning</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorSettingsTypeImpl#getGain <em>Gain</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorSettingsTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorSettingsTypeImpl#getIntegration <em>Integration</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorSettingsTypeImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorSettingsTypeImpl#getReadOutRate <em>Read Out Rate</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorSettingsTypeImpl#getReadOutRateUnit <em>Read Out Rate Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorSettingsTypeImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorSettingsTypeImpl#getVoltageUnit <em>Voltage Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorSettingsTypeImpl#getZoom <em>Zoom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetectorSettingsTypeImpl extends SettingsImpl implements DetectorSettingsType {
	/**
	 * The default value of the '{@link #getBinning() <em>Binning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinning()
	 * @generated
	 * @ordered
	 */
	protected static final Binning BINNING_EDEFAULT = Binning._1X1;

	/**
	 * The cached value of the '{@link #getBinning() <em>Binning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinning()
	 * @generated
	 * @ordered
	 */
	protected Binning binning = BINNING_EDEFAULT;

	/**
	 * This is true if the Binning attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean binningESet;

	/**
	 * The default value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected static final float GAIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected float gain = GAIN_EDEFAULT;

	/**
	 * This is true if the Gain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gainESet;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegration() <em>Integration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegration()
	 * @generated
	 * @ordered
	 */
	protected static final int INTEGRATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntegration() <em>Integration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegration()
	 * @generated
	 * @ordered
	 */
	protected int integration = INTEGRATION_EDEFAULT;

	/**
	 * This is true if the Integration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean integrationESet;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected float offset = OFFSET_EDEFAULT;

	/**
	 * This is true if the Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean offsetESet;

	/**
	 * The default value of the '{@link #getReadOutRate() <em>Read Out Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOutRate()
	 * @generated
	 * @ordered
	 */
	protected static final float READ_OUT_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReadOutRate() <em>Read Out Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOutRate()
	 * @generated
	 * @ordered
	 */
	protected float readOutRate = READ_OUT_RATE_EDEFAULT;

	/**
	 * This is true if the Read Out Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readOutRateESet;

	/**
	 * The default value of the '{@link #getReadOutRateUnit() <em>Read Out Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOutRateUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsFrequency READ_OUT_RATE_UNIT_EDEFAULT = UnitsFrequency.MHZ;

	/**
	 * The cached value of the '{@link #getReadOutRateUnit() <em>Read Out Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOutRateUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsFrequency readOutRateUnit = READ_OUT_RATE_UNIT_EDEFAULT;

	/**
	 * This is true if the Read Out Rate Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readOutRateUnitESet;

	/**
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected float voltage = VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageESet;

	/**
	 * The default value of the '{@link #getVoltageUnit() <em>Voltage Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsElectricPotential VOLTAGE_UNIT_EDEFAULT = UnitsElectricPotential.V;

	/**
	 * The cached value of the '{@link #getVoltageUnit() <em>Voltage Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsElectricPotential voltageUnit = VOLTAGE_UNIT_EDEFAULT;

	/**
	 * This is true if the Voltage Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageUnitESet;

	/**
	 * The default value of the '{@link #getZoom() <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoom()
	 * @generated
	 * @ordered
	 */
	protected static final float ZOOM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getZoom() <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoom()
	 * @generated
	 * @ordered
	 */
	protected float zoom = ZOOM_EDEFAULT;

	/**
	 * This is true if the Zoom attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zoomESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetectorSettingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getDetectorSettingsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binning getBinning() {
		return binning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinning(Binning newBinning) {
		Binning oldBinning = binning;
		binning = newBinning == null ? BINNING_EDEFAULT : newBinning;
		boolean oldBinningESet = binningESet;
		binningESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_SETTINGS_TYPE__BINNING, oldBinning, binning, !oldBinningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBinning() {
		Binning oldBinning = binning;
		boolean oldBinningESet = binningESet;
		binning = BINNING_EDEFAULT;
		binningESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_SETTINGS_TYPE__BINNING, oldBinning, BINNING_EDEFAULT, oldBinningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBinning() {
		return binningESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getGain() {
		return gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGain(float newGain) {
		float oldGain = gain;
		gain = newGain;
		boolean oldGainESet = gainESet;
		gainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_SETTINGS_TYPE__GAIN, oldGain, gain, !oldGainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGain() {
		float oldGain = gain;
		boolean oldGainESet = gainESet;
		gain = GAIN_EDEFAULT;
		gainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_SETTINGS_TYPE__GAIN, oldGain, GAIN_EDEFAULT, oldGainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGain() {
		return gainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_SETTINGS_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIntegration() {
		return integration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegration(int newIntegration) {
		int oldIntegration = integration;
		integration = newIntegration;
		boolean oldIntegrationESet = integrationESet;
		integrationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_SETTINGS_TYPE__INTEGRATION, oldIntegration, integration, !oldIntegrationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIntegration() {
		int oldIntegration = integration;
		boolean oldIntegrationESet = integrationESet;
		integration = INTEGRATION_EDEFAULT;
		integrationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_SETTINGS_TYPE__INTEGRATION, oldIntegration, INTEGRATION_EDEFAULT, oldIntegrationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIntegration() {
		return integrationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset(float newOffset) {
		float oldOffset = offset;
		offset = newOffset;
		boolean oldOffsetESet = offsetESet;
		offsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_SETTINGS_TYPE__OFFSET, oldOffset, offset, !oldOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOffset() {
		float oldOffset = offset;
		boolean oldOffsetESet = offsetESet;
		offset = OFFSET_EDEFAULT;
		offsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_SETTINGS_TYPE__OFFSET, oldOffset, OFFSET_EDEFAULT, oldOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOffset() {
		return offsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getReadOutRate() {
		return readOutRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOutRate(float newReadOutRate) {
		float oldReadOutRate = readOutRate;
		readOutRate = newReadOutRate;
		boolean oldReadOutRateESet = readOutRateESet;
		readOutRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_SETTINGS_TYPE__READ_OUT_RATE, oldReadOutRate, readOutRate, !oldReadOutRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReadOutRate() {
		float oldReadOutRate = readOutRate;
		boolean oldReadOutRateESet = readOutRateESet;
		readOutRate = READ_OUT_RATE_EDEFAULT;
		readOutRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_SETTINGS_TYPE__READ_OUT_RATE, oldReadOutRate, READ_OUT_RATE_EDEFAULT, oldReadOutRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReadOutRate() {
		return readOutRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsFrequency getReadOutRateUnit() {
		return readOutRateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOutRateUnit(UnitsFrequency newReadOutRateUnit) {
		UnitsFrequency oldReadOutRateUnit = readOutRateUnit;
		readOutRateUnit = newReadOutRateUnit == null ? READ_OUT_RATE_UNIT_EDEFAULT : newReadOutRateUnit;
		boolean oldReadOutRateUnitESet = readOutRateUnitESet;
		readOutRateUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_SETTINGS_TYPE__READ_OUT_RATE_UNIT, oldReadOutRateUnit, readOutRateUnit, !oldReadOutRateUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReadOutRateUnit() {
		UnitsFrequency oldReadOutRateUnit = readOutRateUnit;
		boolean oldReadOutRateUnitESet = readOutRateUnitESet;
		readOutRateUnit = READ_OUT_RATE_UNIT_EDEFAULT;
		readOutRateUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_SETTINGS_TYPE__READ_OUT_RATE_UNIT, oldReadOutRateUnit, READ_OUT_RATE_UNIT_EDEFAULT, oldReadOutRateUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReadOutRateUnit() {
		return readOutRateUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoltage(float newVoltage) {
		float oldVoltage = voltage;
		voltage = newVoltage;
		boolean oldVoltageESet = voltageESet;
		voltageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_SETTINGS_TYPE__VOLTAGE, oldVoltage, voltage, !oldVoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVoltage() {
		float oldVoltage = voltage;
		boolean oldVoltageESet = voltageESet;
		voltage = VOLTAGE_EDEFAULT;
		voltageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_SETTINGS_TYPE__VOLTAGE, oldVoltage, VOLTAGE_EDEFAULT, oldVoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVoltage() {
		return voltageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsElectricPotential getVoltageUnit() {
		return voltageUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoltageUnit(UnitsElectricPotential newVoltageUnit) {
		UnitsElectricPotential oldVoltageUnit = voltageUnit;
		voltageUnit = newVoltageUnit == null ? VOLTAGE_UNIT_EDEFAULT : newVoltageUnit;
		boolean oldVoltageUnitESet = voltageUnitESet;
		voltageUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_SETTINGS_TYPE__VOLTAGE_UNIT, oldVoltageUnit, voltageUnit, !oldVoltageUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVoltageUnit() {
		UnitsElectricPotential oldVoltageUnit = voltageUnit;
		boolean oldVoltageUnitESet = voltageUnitESet;
		voltageUnit = VOLTAGE_UNIT_EDEFAULT;
		voltageUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_SETTINGS_TYPE__VOLTAGE_UNIT, oldVoltageUnit, VOLTAGE_UNIT_EDEFAULT, oldVoltageUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVoltageUnit() {
		return voltageUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getZoom() {
		return zoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZoom(float newZoom) {
		float oldZoom = zoom;
		zoom = newZoom;
		boolean oldZoomESet = zoomESet;
		zoomESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_SETTINGS_TYPE__ZOOM, oldZoom, zoom, !oldZoomESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZoom() {
		float oldZoom = zoom;
		boolean oldZoomESet = zoomESet;
		zoom = ZOOM_EDEFAULT;
		zoomESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_SETTINGS_TYPE__ZOOM, oldZoom, ZOOM_EDEFAULT, oldZoomESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZoom() {
		return zoomESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.DETECTOR_SETTINGS_TYPE__BINNING:
				return getBinning();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__GAIN:
				return getGain();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__ID:
				return getID();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__INTEGRATION:
				return getIntegration();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__OFFSET:
				return getOffset();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__READ_OUT_RATE:
				return getReadOutRate();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__READ_OUT_RATE_UNIT:
				return getReadOutRateUnit();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__VOLTAGE:
				return getVoltage();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__VOLTAGE_UNIT:
				return getVoltageUnit();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__ZOOM:
				return getZoom();
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
			case OMEPackage.DETECTOR_SETTINGS_TYPE__BINNING:
				setBinning((Binning)newValue);
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__GAIN:
				setGain((Float)newValue);
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__INTEGRATION:
				setIntegration((Integer)newValue);
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__OFFSET:
				setOffset((Float)newValue);
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__READ_OUT_RATE:
				setReadOutRate((Float)newValue);
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__READ_OUT_RATE_UNIT:
				setReadOutRateUnit((UnitsFrequency)newValue);
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__VOLTAGE:
				setVoltage((Float)newValue);
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__VOLTAGE_UNIT:
				setVoltageUnit((UnitsElectricPotential)newValue);
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__ZOOM:
				setZoom((Float)newValue);
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
			case OMEPackage.DETECTOR_SETTINGS_TYPE__BINNING:
				unsetBinning();
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__GAIN:
				unsetGain();
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__INTEGRATION:
				unsetIntegration();
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__OFFSET:
				unsetOffset();
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__READ_OUT_RATE:
				unsetReadOutRate();
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__READ_OUT_RATE_UNIT:
				unsetReadOutRateUnit();
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__VOLTAGE:
				unsetVoltage();
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__VOLTAGE_UNIT:
				unsetVoltageUnit();
				return;
			case OMEPackage.DETECTOR_SETTINGS_TYPE__ZOOM:
				unsetZoom();
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
			case OMEPackage.DETECTOR_SETTINGS_TYPE__BINNING:
				return isSetBinning();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__GAIN:
				return isSetGain();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.DETECTOR_SETTINGS_TYPE__INTEGRATION:
				return isSetIntegration();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__OFFSET:
				return isSetOffset();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__READ_OUT_RATE:
				return isSetReadOutRate();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__READ_OUT_RATE_UNIT:
				return isSetReadOutRateUnit();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__VOLTAGE:
				return isSetVoltage();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__VOLTAGE_UNIT:
				return isSetVoltageUnit();
			case OMEPackage.DETECTOR_SETTINGS_TYPE__ZOOM:
				return isSetZoom();
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
		result.append(" (binning: ");
		if (binningESet) result.append(binning); else result.append("<unset>");
		result.append(", gain: ");
		if (gainESet) result.append(gain); else result.append("<unset>");
		result.append(", iD: ");
		result.append(iD);
		result.append(", integration: ");
		if (integrationESet) result.append(integration); else result.append("<unset>");
		result.append(", offset: ");
		if (offsetESet) result.append(offset); else result.append("<unset>");
		result.append(", readOutRate: ");
		if (readOutRateESet) result.append(readOutRate); else result.append("<unset>");
		result.append(", readOutRateUnit: ");
		if (readOutRateUnitESet) result.append(readOutRateUnit); else result.append("<unset>");
		result.append(", voltage: ");
		if (voltageESet) result.append(voltage); else result.append("<unset>");
		result.append(", voltageUnit: ");
		if (voltageUnitESet) result.append(voltageUnit); else result.append("<unset>");
		result.append(", zoom: ");
		if (zoomESet) result.append(zoom); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DetectorSettingsTypeImpl
