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

import org.openmicroscopy.ome.LaserMediumType;
import org.openmicroscopy.ome.LaserType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.PulseType;
import org.openmicroscopy.ome.PumpType;
import org.openmicroscopy.ome.TypeType3;
import org.openmicroscopy.ome.UnitsFrequency;
import org.openmicroscopy.ome.UnitsLength;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Laser Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.LaserTypeImpl#getPump <em>Pump</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LaserTypeImpl#getFrequencyMultiplication <em>Frequency Multiplication</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LaserTypeImpl#getLaserMedium <em>Laser Medium</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LaserTypeImpl#isPockelCell <em>Pockel Cell</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LaserTypeImpl#getPulse <em>Pulse</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LaserTypeImpl#getRepetitionRate <em>Repetition Rate</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LaserTypeImpl#getRepetitionRateUnit <em>Repetition Rate Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LaserTypeImpl#isTuneable <em>Tuneable</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LaserTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LaserTypeImpl#getWavelength <em>Wavelength</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LaserTypeImpl#getWavelengthUnit <em>Wavelength Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaserTypeImpl extends LightSourceImpl implements LaserType {
	/**
	 * The cached value of the '{@link #getPump() <em>Pump</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPump()
	 * @generated
	 * @ordered
	 */
	protected PumpType pump;

	/**
	 * The default value of the '{@link #getFrequencyMultiplication() <em>Frequency Multiplication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyMultiplication()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCY_MULTIPLICATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrequencyMultiplication() <em>Frequency Multiplication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyMultiplication()
	 * @generated
	 * @ordered
	 */
	protected int frequencyMultiplication = FREQUENCY_MULTIPLICATION_EDEFAULT;

	/**
	 * This is true if the Frequency Multiplication attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frequencyMultiplicationESet;

	/**
	 * The default value of the '{@link #getLaserMedium() <em>Laser Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaserMedium()
	 * @generated
	 * @ordered
	 */
	protected static final LaserMediumType LASER_MEDIUM_EDEFAULT = LaserMediumType.CU;

	/**
	 * The cached value of the '{@link #getLaserMedium() <em>Laser Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaserMedium()
	 * @generated
	 * @ordered
	 */
	protected LaserMediumType laserMedium = LASER_MEDIUM_EDEFAULT;

	/**
	 * This is true if the Laser Medium attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean laserMediumESet;

	/**
	 * The default value of the '{@link #isPockelCell() <em>Pockel Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPockelCell()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POCKEL_CELL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPockelCell() <em>Pockel Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPockelCell()
	 * @generated
	 * @ordered
	 */
	protected boolean pockelCell = POCKEL_CELL_EDEFAULT;

	/**
	 * This is true if the Pockel Cell attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pockelCellESet;

	/**
	 * The default value of the '{@link #getPulse() <em>Pulse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulse()
	 * @generated
	 * @ordered
	 */
	protected static final PulseType PULSE_EDEFAULT = PulseType.CW;

	/**
	 * The cached value of the '{@link #getPulse() <em>Pulse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulse()
	 * @generated
	 * @ordered
	 */
	protected PulseType pulse = PULSE_EDEFAULT;

	/**
	 * This is true if the Pulse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pulseESet;

	/**
	 * The default value of the '{@link #getRepetitionRate() <em>Repetition Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionRate()
	 * @generated
	 * @ordered
	 */
	protected static final float REPETITION_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRepetitionRate() <em>Repetition Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionRate()
	 * @generated
	 * @ordered
	 */
	protected float repetitionRate = REPETITION_RATE_EDEFAULT;

	/**
	 * This is true if the Repetition Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repetitionRateESet;

	/**
	 * The default value of the '{@link #getRepetitionRateUnit() <em>Repetition Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionRateUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsFrequency REPETITION_RATE_UNIT_EDEFAULT = UnitsFrequency.HZ;

	/**
	 * The cached value of the '{@link #getRepetitionRateUnit() <em>Repetition Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionRateUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsFrequency repetitionRateUnit = REPETITION_RATE_UNIT_EDEFAULT;

	/**
	 * This is true if the Repetition Rate Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repetitionRateUnitESet;

	/**
	 * The default value of the '{@link #isTuneable() <em>Tuneable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTuneable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TUNEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTuneable() <em>Tuneable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTuneable()
	 * @generated
	 * @ordered
	 */
	protected boolean tuneable = TUNEABLE_EDEFAULT;

	/**
	 * This is true if the Tuneable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tuneableESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType3 TYPE_EDEFAULT = TypeType3.EXCIMER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType3 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getWavelength() <em>Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWavelength()
	 * @generated
	 * @ordered
	 */
	protected static final float WAVELENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWavelength() <em>Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWavelength()
	 * @generated
	 * @ordered
	 */
	protected float wavelength = WAVELENGTH_EDEFAULT;

	/**
	 * This is true if the Wavelength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wavelengthESet;

	/**
	 * The default value of the '{@link #getWavelengthUnit() <em>Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWavelengthUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength WAVELENGTH_UNIT_EDEFAULT = UnitsLength.NM;

	/**
	 * The cached value of the '{@link #getWavelengthUnit() <em>Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWavelengthUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength wavelengthUnit = WAVELENGTH_UNIT_EDEFAULT;

	/**
	 * This is true if the Wavelength Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wavelengthUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaserTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getLaserType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PumpType getPump() {
		return pump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPump(PumpType newPump, NotificationChain msgs) {
		PumpType oldPump = pump;
		pump = newPump;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.LASER_TYPE__PUMP, oldPump, newPump);
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
	public void setPump(PumpType newPump) {
		if (newPump != pump) {
			NotificationChain msgs = null;
			if (pump != null)
				msgs = ((InternalEObject)pump).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.LASER_TYPE__PUMP, null, msgs);
			if (newPump != null)
				msgs = ((InternalEObject)newPump).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.LASER_TYPE__PUMP, null, msgs);
			msgs = basicSetPump(newPump, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LASER_TYPE__PUMP, newPump, newPump));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFrequencyMultiplication() {
		return frequencyMultiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequencyMultiplication(int newFrequencyMultiplication) {
		int oldFrequencyMultiplication = frequencyMultiplication;
		frequencyMultiplication = newFrequencyMultiplication;
		boolean oldFrequencyMultiplicationESet = frequencyMultiplicationESet;
		frequencyMultiplicationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LASER_TYPE__FREQUENCY_MULTIPLICATION, oldFrequencyMultiplication, frequencyMultiplication, !oldFrequencyMultiplicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFrequencyMultiplication() {
		int oldFrequencyMultiplication = frequencyMultiplication;
		boolean oldFrequencyMultiplicationESet = frequencyMultiplicationESet;
		frequencyMultiplication = FREQUENCY_MULTIPLICATION_EDEFAULT;
		frequencyMultiplicationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LASER_TYPE__FREQUENCY_MULTIPLICATION, oldFrequencyMultiplication, FREQUENCY_MULTIPLICATION_EDEFAULT, oldFrequencyMultiplicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFrequencyMultiplication() {
		return frequencyMultiplicationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LaserMediumType getLaserMedium() {
		return laserMedium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaserMedium(LaserMediumType newLaserMedium) {
		LaserMediumType oldLaserMedium = laserMedium;
		laserMedium = newLaserMedium == null ? LASER_MEDIUM_EDEFAULT : newLaserMedium;
		boolean oldLaserMediumESet = laserMediumESet;
		laserMediumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LASER_TYPE__LASER_MEDIUM, oldLaserMedium, laserMedium, !oldLaserMediumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLaserMedium() {
		LaserMediumType oldLaserMedium = laserMedium;
		boolean oldLaserMediumESet = laserMediumESet;
		laserMedium = LASER_MEDIUM_EDEFAULT;
		laserMediumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LASER_TYPE__LASER_MEDIUM, oldLaserMedium, LASER_MEDIUM_EDEFAULT, oldLaserMediumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLaserMedium() {
		return laserMediumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPockelCell() {
		return pockelCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPockelCell(boolean newPockelCell) {
		boolean oldPockelCell = pockelCell;
		pockelCell = newPockelCell;
		boolean oldPockelCellESet = pockelCellESet;
		pockelCellESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LASER_TYPE__POCKEL_CELL, oldPockelCell, pockelCell, !oldPockelCellESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPockelCell() {
		boolean oldPockelCell = pockelCell;
		boolean oldPockelCellESet = pockelCellESet;
		pockelCell = POCKEL_CELL_EDEFAULT;
		pockelCellESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LASER_TYPE__POCKEL_CELL, oldPockelCell, POCKEL_CELL_EDEFAULT, oldPockelCellESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPockelCell() {
		return pockelCellESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PulseType getPulse() {
		return pulse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPulse(PulseType newPulse) {
		PulseType oldPulse = pulse;
		pulse = newPulse == null ? PULSE_EDEFAULT : newPulse;
		boolean oldPulseESet = pulseESet;
		pulseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LASER_TYPE__PULSE, oldPulse, pulse, !oldPulseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPulse() {
		PulseType oldPulse = pulse;
		boolean oldPulseESet = pulseESet;
		pulse = PULSE_EDEFAULT;
		pulseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LASER_TYPE__PULSE, oldPulse, PULSE_EDEFAULT, oldPulseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPulse() {
		return pulseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getRepetitionRate() {
		return repetitionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepetitionRate(float newRepetitionRate) {
		float oldRepetitionRate = repetitionRate;
		repetitionRate = newRepetitionRate;
		boolean oldRepetitionRateESet = repetitionRateESet;
		repetitionRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LASER_TYPE__REPETITION_RATE, oldRepetitionRate, repetitionRate, !oldRepetitionRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRepetitionRate() {
		float oldRepetitionRate = repetitionRate;
		boolean oldRepetitionRateESet = repetitionRateESet;
		repetitionRate = REPETITION_RATE_EDEFAULT;
		repetitionRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LASER_TYPE__REPETITION_RATE, oldRepetitionRate, REPETITION_RATE_EDEFAULT, oldRepetitionRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRepetitionRate() {
		return repetitionRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsFrequency getRepetitionRateUnit() {
		return repetitionRateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepetitionRateUnit(UnitsFrequency newRepetitionRateUnit) {
		UnitsFrequency oldRepetitionRateUnit = repetitionRateUnit;
		repetitionRateUnit = newRepetitionRateUnit == null ? REPETITION_RATE_UNIT_EDEFAULT : newRepetitionRateUnit;
		boolean oldRepetitionRateUnitESet = repetitionRateUnitESet;
		repetitionRateUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LASER_TYPE__REPETITION_RATE_UNIT, oldRepetitionRateUnit, repetitionRateUnit, !oldRepetitionRateUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRepetitionRateUnit() {
		UnitsFrequency oldRepetitionRateUnit = repetitionRateUnit;
		boolean oldRepetitionRateUnitESet = repetitionRateUnitESet;
		repetitionRateUnit = REPETITION_RATE_UNIT_EDEFAULT;
		repetitionRateUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LASER_TYPE__REPETITION_RATE_UNIT, oldRepetitionRateUnit, REPETITION_RATE_UNIT_EDEFAULT, oldRepetitionRateUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRepetitionRateUnit() {
		return repetitionRateUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTuneable() {
		return tuneable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTuneable(boolean newTuneable) {
		boolean oldTuneable = tuneable;
		tuneable = newTuneable;
		boolean oldTuneableESet = tuneableESet;
		tuneableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LASER_TYPE__TUNEABLE, oldTuneable, tuneable, !oldTuneableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTuneable() {
		boolean oldTuneable = tuneable;
		boolean oldTuneableESet = tuneableESet;
		tuneable = TUNEABLE_EDEFAULT;
		tuneableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LASER_TYPE__TUNEABLE, oldTuneable, TUNEABLE_EDEFAULT, oldTuneableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTuneable() {
		return tuneableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType3 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType3 newType) {
		TypeType3 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LASER_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType3 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LASER_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWavelength() {
		return wavelength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWavelength(float newWavelength) {
		float oldWavelength = wavelength;
		wavelength = newWavelength;
		boolean oldWavelengthESet = wavelengthESet;
		wavelengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LASER_TYPE__WAVELENGTH, oldWavelength, wavelength, !oldWavelengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWavelength() {
		float oldWavelength = wavelength;
		boolean oldWavelengthESet = wavelengthESet;
		wavelength = WAVELENGTH_EDEFAULT;
		wavelengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LASER_TYPE__WAVELENGTH, oldWavelength, WAVELENGTH_EDEFAULT, oldWavelengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWavelength() {
		return wavelengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getWavelengthUnit() {
		return wavelengthUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWavelengthUnit(UnitsLength newWavelengthUnit) {
		UnitsLength oldWavelengthUnit = wavelengthUnit;
		wavelengthUnit = newWavelengthUnit == null ? WAVELENGTH_UNIT_EDEFAULT : newWavelengthUnit;
		boolean oldWavelengthUnitESet = wavelengthUnitESet;
		wavelengthUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LASER_TYPE__WAVELENGTH_UNIT, oldWavelengthUnit, wavelengthUnit, !oldWavelengthUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWavelengthUnit() {
		UnitsLength oldWavelengthUnit = wavelengthUnit;
		boolean oldWavelengthUnitESet = wavelengthUnitESet;
		wavelengthUnit = WAVELENGTH_UNIT_EDEFAULT;
		wavelengthUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LASER_TYPE__WAVELENGTH_UNIT, oldWavelengthUnit, WAVELENGTH_UNIT_EDEFAULT, oldWavelengthUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWavelengthUnit() {
		return wavelengthUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.LASER_TYPE__PUMP:
				return basicSetPump(null, msgs);
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
			case OMEPackage.LASER_TYPE__PUMP:
				return getPump();
			case OMEPackage.LASER_TYPE__FREQUENCY_MULTIPLICATION:
				return getFrequencyMultiplication();
			case OMEPackage.LASER_TYPE__LASER_MEDIUM:
				return getLaserMedium();
			case OMEPackage.LASER_TYPE__POCKEL_CELL:
				return isPockelCell();
			case OMEPackage.LASER_TYPE__PULSE:
				return getPulse();
			case OMEPackage.LASER_TYPE__REPETITION_RATE:
				return getRepetitionRate();
			case OMEPackage.LASER_TYPE__REPETITION_RATE_UNIT:
				return getRepetitionRateUnit();
			case OMEPackage.LASER_TYPE__TUNEABLE:
				return isTuneable();
			case OMEPackage.LASER_TYPE__TYPE:
				return getType();
			case OMEPackage.LASER_TYPE__WAVELENGTH:
				return getWavelength();
			case OMEPackage.LASER_TYPE__WAVELENGTH_UNIT:
				return getWavelengthUnit();
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
			case OMEPackage.LASER_TYPE__PUMP:
				setPump((PumpType)newValue);
				return;
			case OMEPackage.LASER_TYPE__FREQUENCY_MULTIPLICATION:
				setFrequencyMultiplication((Integer)newValue);
				return;
			case OMEPackage.LASER_TYPE__LASER_MEDIUM:
				setLaserMedium((LaserMediumType)newValue);
				return;
			case OMEPackage.LASER_TYPE__POCKEL_CELL:
				setPockelCell((Boolean)newValue);
				return;
			case OMEPackage.LASER_TYPE__PULSE:
				setPulse((PulseType)newValue);
				return;
			case OMEPackage.LASER_TYPE__REPETITION_RATE:
				setRepetitionRate((Float)newValue);
				return;
			case OMEPackage.LASER_TYPE__REPETITION_RATE_UNIT:
				setRepetitionRateUnit((UnitsFrequency)newValue);
				return;
			case OMEPackage.LASER_TYPE__TUNEABLE:
				setTuneable((Boolean)newValue);
				return;
			case OMEPackage.LASER_TYPE__TYPE:
				setType((TypeType3)newValue);
				return;
			case OMEPackage.LASER_TYPE__WAVELENGTH:
				setWavelength((Float)newValue);
				return;
			case OMEPackage.LASER_TYPE__WAVELENGTH_UNIT:
				setWavelengthUnit((UnitsLength)newValue);
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
			case OMEPackage.LASER_TYPE__PUMP:
				setPump((PumpType)null);
				return;
			case OMEPackage.LASER_TYPE__FREQUENCY_MULTIPLICATION:
				unsetFrequencyMultiplication();
				return;
			case OMEPackage.LASER_TYPE__LASER_MEDIUM:
				unsetLaserMedium();
				return;
			case OMEPackage.LASER_TYPE__POCKEL_CELL:
				unsetPockelCell();
				return;
			case OMEPackage.LASER_TYPE__PULSE:
				unsetPulse();
				return;
			case OMEPackage.LASER_TYPE__REPETITION_RATE:
				unsetRepetitionRate();
				return;
			case OMEPackage.LASER_TYPE__REPETITION_RATE_UNIT:
				unsetRepetitionRateUnit();
				return;
			case OMEPackage.LASER_TYPE__TUNEABLE:
				unsetTuneable();
				return;
			case OMEPackage.LASER_TYPE__TYPE:
				unsetType();
				return;
			case OMEPackage.LASER_TYPE__WAVELENGTH:
				unsetWavelength();
				return;
			case OMEPackage.LASER_TYPE__WAVELENGTH_UNIT:
				unsetWavelengthUnit();
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
			case OMEPackage.LASER_TYPE__PUMP:
				return pump != null;
			case OMEPackage.LASER_TYPE__FREQUENCY_MULTIPLICATION:
				return isSetFrequencyMultiplication();
			case OMEPackage.LASER_TYPE__LASER_MEDIUM:
				return isSetLaserMedium();
			case OMEPackage.LASER_TYPE__POCKEL_CELL:
				return isSetPockelCell();
			case OMEPackage.LASER_TYPE__PULSE:
				return isSetPulse();
			case OMEPackage.LASER_TYPE__REPETITION_RATE:
				return isSetRepetitionRate();
			case OMEPackage.LASER_TYPE__REPETITION_RATE_UNIT:
				return isSetRepetitionRateUnit();
			case OMEPackage.LASER_TYPE__TUNEABLE:
				return isSetTuneable();
			case OMEPackage.LASER_TYPE__TYPE:
				return isSetType();
			case OMEPackage.LASER_TYPE__WAVELENGTH:
				return isSetWavelength();
			case OMEPackage.LASER_TYPE__WAVELENGTH_UNIT:
				return isSetWavelengthUnit();
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
		result.append(" (frequencyMultiplication: ");
		if (frequencyMultiplicationESet) result.append(frequencyMultiplication); else result.append("<unset>");
		result.append(", laserMedium: ");
		if (laserMediumESet) result.append(laserMedium); else result.append("<unset>");
		result.append(", pockelCell: ");
		if (pockelCellESet) result.append(pockelCell); else result.append("<unset>");
		result.append(", pulse: ");
		if (pulseESet) result.append(pulse); else result.append("<unset>");
		result.append(", repetitionRate: ");
		if (repetitionRateESet) result.append(repetitionRate); else result.append("<unset>");
		result.append(", repetitionRateUnit: ");
		if (repetitionRateUnitESet) result.append(repetitionRateUnit); else result.append("<unset>");
		result.append(", tuneable: ");
		if (tuneableESet) result.append(tuneable); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", wavelength: ");
		if (wavelengthESet) result.append(wavelength); else result.append("<unset>");
		result.append(", wavelengthUnit: ");
		if (wavelengthUnitESet) result.append(wavelengthUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LaserTypeImpl
