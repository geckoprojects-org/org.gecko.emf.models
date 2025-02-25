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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.TransmittanceRangeType;
import org.openmicroscopy.ome.UnitsLength;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmittance Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.TransmittanceRangeTypeImpl#getCutIn <em>Cut In</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TransmittanceRangeTypeImpl#getCutInTolerance <em>Cut In Tolerance</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TransmittanceRangeTypeImpl#getCutInToleranceUnit <em>Cut In Tolerance Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TransmittanceRangeTypeImpl#getCutInUnit <em>Cut In Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TransmittanceRangeTypeImpl#getCutOut <em>Cut Out</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TransmittanceRangeTypeImpl#getCutOutTolerance <em>Cut Out Tolerance</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TransmittanceRangeTypeImpl#getCutOutToleranceUnit <em>Cut Out Tolerance Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TransmittanceRangeTypeImpl#getCutOutUnit <em>Cut Out Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TransmittanceRangeTypeImpl#getTransmittance <em>Transmittance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmittanceRangeTypeImpl extends MinimalEObjectImpl.Container implements TransmittanceRangeType {
	/**
	 * The default value of the '{@link #getCutIn() <em>Cut In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutIn()
	 * @generated
	 * @ordered
	 */
	protected static final float CUT_IN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCutIn() <em>Cut In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutIn()
	 * @generated
	 * @ordered
	 */
	protected float cutIn = CUT_IN_EDEFAULT;

	/**
	 * This is true if the Cut In attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cutInESet;

	/**
	 * The default value of the '{@link #getCutInTolerance() <em>Cut In Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutInTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final float CUT_IN_TOLERANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCutInTolerance() <em>Cut In Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutInTolerance()
	 * @generated
	 * @ordered
	 */
	protected float cutInTolerance = CUT_IN_TOLERANCE_EDEFAULT;

	/**
	 * This is true if the Cut In Tolerance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cutInToleranceESet;

	/**
	 * The default value of the '{@link #getCutInToleranceUnit() <em>Cut In Tolerance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutInToleranceUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength CUT_IN_TOLERANCE_UNIT_EDEFAULT = UnitsLength.NM;

	/**
	 * The cached value of the '{@link #getCutInToleranceUnit() <em>Cut In Tolerance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutInToleranceUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength cutInToleranceUnit = CUT_IN_TOLERANCE_UNIT_EDEFAULT;

	/**
	 * This is true if the Cut In Tolerance Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cutInToleranceUnitESet;

	/**
	 * The default value of the '{@link #getCutInUnit() <em>Cut In Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutInUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength CUT_IN_UNIT_EDEFAULT = UnitsLength.NM;

	/**
	 * The cached value of the '{@link #getCutInUnit() <em>Cut In Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutInUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength cutInUnit = CUT_IN_UNIT_EDEFAULT;

	/**
	 * This is true if the Cut In Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cutInUnitESet;

	/**
	 * The default value of the '{@link #getCutOut() <em>Cut Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOut()
	 * @generated
	 * @ordered
	 */
	protected static final float CUT_OUT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCutOut() <em>Cut Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOut()
	 * @generated
	 * @ordered
	 */
	protected float cutOut = CUT_OUT_EDEFAULT;

	/**
	 * This is true if the Cut Out attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cutOutESet;

	/**
	 * The default value of the '{@link #getCutOutTolerance() <em>Cut Out Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOutTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final float CUT_OUT_TOLERANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCutOutTolerance() <em>Cut Out Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOutTolerance()
	 * @generated
	 * @ordered
	 */
	protected float cutOutTolerance = CUT_OUT_TOLERANCE_EDEFAULT;

	/**
	 * This is true if the Cut Out Tolerance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cutOutToleranceESet;

	/**
	 * The default value of the '{@link #getCutOutToleranceUnit() <em>Cut Out Tolerance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOutToleranceUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength CUT_OUT_TOLERANCE_UNIT_EDEFAULT = UnitsLength.NM;

	/**
	 * The cached value of the '{@link #getCutOutToleranceUnit() <em>Cut Out Tolerance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOutToleranceUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength cutOutToleranceUnit = CUT_OUT_TOLERANCE_UNIT_EDEFAULT;

	/**
	 * This is true if the Cut Out Tolerance Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cutOutToleranceUnitESet;

	/**
	 * The default value of the '{@link #getCutOutUnit() <em>Cut Out Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOutUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength CUT_OUT_UNIT_EDEFAULT = UnitsLength.NM;

	/**
	 * The cached value of the '{@link #getCutOutUnit() <em>Cut Out Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOutUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength cutOutUnit = CUT_OUT_UNIT_EDEFAULT;

	/**
	 * This is true if the Cut Out Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cutOutUnitESet;

	/**
	 * The default value of the '{@link #getTransmittance() <em>Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmittance()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSMITTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransmittance() <em>Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmittance()
	 * @generated
	 * @ordered
	 */
	protected float transmittance = TRANSMITTANCE_EDEFAULT;

	/**
	 * This is true if the Transmittance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transmittanceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmittanceRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getTransmittanceRangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCutIn() {
		return cutIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCutIn(float newCutIn) {
		float oldCutIn = cutIn;
		cutIn = newCutIn;
		boolean oldCutInESet = cutInESet;
		cutInESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN, oldCutIn, cutIn, !oldCutInESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCutIn() {
		float oldCutIn = cutIn;
		boolean oldCutInESet = cutInESet;
		cutIn = CUT_IN_EDEFAULT;
		cutInESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN, oldCutIn, CUT_IN_EDEFAULT, oldCutInESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCutIn() {
		return cutInESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCutInTolerance() {
		return cutInTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCutInTolerance(float newCutInTolerance) {
		float oldCutInTolerance = cutInTolerance;
		cutInTolerance = newCutInTolerance;
		boolean oldCutInToleranceESet = cutInToleranceESet;
		cutInToleranceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE, oldCutInTolerance, cutInTolerance, !oldCutInToleranceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCutInTolerance() {
		float oldCutInTolerance = cutInTolerance;
		boolean oldCutInToleranceESet = cutInToleranceESet;
		cutInTolerance = CUT_IN_TOLERANCE_EDEFAULT;
		cutInToleranceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE, oldCutInTolerance, CUT_IN_TOLERANCE_EDEFAULT, oldCutInToleranceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCutInTolerance() {
		return cutInToleranceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getCutInToleranceUnit() {
		return cutInToleranceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCutInToleranceUnit(UnitsLength newCutInToleranceUnit) {
		UnitsLength oldCutInToleranceUnit = cutInToleranceUnit;
		cutInToleranceUnit = newCutInToleranceUnit == null ? CUT_IN_TOLERANCE_UNIT_EDEFAULT : newCutInToleranceUnit;
		boolean oldCutInToleranceUnitESet = cutInToleranceUnitESet;
		cutInToleranceUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE_UNIT, oldCutInToleranceUnit, cutInToleranceUnit, !oldCutInToleranceUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCutInToleranceUnit() {
		UnitsLength oldCutInToleranceUnit = cutInToleranceUnit;
		boolean oldCutInToleranceUnitESet = cutInToleranceUnitESet;
		cutInToleranceUnit = CUT_IN_TOLERANCE_UNIT_EDEFAULT;
		cutInToleranceUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE_UNIT, oldCutInToleranceUnit, CUT_IN_TOLERANCE_UNIT_EDEFAULT, oldCutInToleranceUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCutInToleranceUnit() {
		return cutInToleranceUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getCutInUnit() {
		return cutInUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCutInUnit(UnitsLength newCutInUnit) {
		UnitsLength oldCutInUnit = cutInUnit;
		cutInUnit = newCutInUnit == null ? CUT_IN_UNIT_EDEFAULT : newCutInUnit;
		boolean oldCutInUnitESet = cutInUnitESet;
		cutInUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_UNIT, oldCutInUnit, cutInUnit, !oldCutInUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCutInUnit() {
		UnitsLength oldCutInUnit = cutInUnit;
		boolean oldCutInUnitESet = cutInUnitESet;
		cutInUnit = CUT_IN_UNIT_EDEFAULT;
		cutInUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_UNIT, oldCutInUnit, CUT_IN_UNIT_EDEFAULT, oldCutInUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCutInUnit() {
		return cutInUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCutOut() {
		return cutOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCutOut(float newCutOut) {
		float oldCutOut = cutOut;
		cutOut = newCutOut;
		boolean oldCutOutESet = cutOutESet;
		cutOutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT, oldCutOut, cutOut, !oldCutOutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCutOut() {
		float oldCutOut = cutOut;
		boolean oldCutOutESet = cutOutESet;
		cutOut = CUT_OUT_EDEFAULT;
		cutOutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT, oldCutOut, CUT_OUT_EDEFAULT, oldCutOutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCutOut() {
		return cutOutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCutOutTolerance() {
		return cutOutTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCutOutTolerance(float newCutOutTolerance) {
		float oldCutOutTolerance = cutOutTolerance;
		cutOutTolerance = newCutOutTolerance;
		boolean oldCutOutToleranceESet = cutOutToleranceESet;
		cutOutToleranceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE, oldCutOutTolerance, cutOutTolerance, !oldCutOutToleranceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCutOutTolerance() {
		float oldCutOutTolerance = cutOutTolerance;
		boolean oldCutOutToleranceESet = cutOutToleranceESet;
		cutOutTolerance = CUT_OUT_TOLERANCE_EDEFAULT;
		cutOutToleranceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE, oldCutOutTolerance, CUT_OUT_TOLERANCE_EDEFAULT, oldCutOutToleranceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCutOutTolerance() {
		return cutOutToleranceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getCutOutToleranceUnit() {
		return cutOutToleranceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCutOutToleranceUnit(UnitsLength newCutOutToleranceUnit) {
		UnitsLength oldCutOutToleranceUnit = cutOutToleranceUnit;
		cutOutToleranceUnit = newCutOutToleranceUnit == null ? CUT_OUT_TOLERANCE_UNIT_EDEFAULT : newCutOutToleranceUnit;
		boolean oldCutOutToleranceUnitESet = cutOutToleranceUnitESet;
		cutOutToleranceUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE_UNIT, oldCutOutToleranceUnit, cutOutToleranceUnit, !oldCutOutToleranceUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCutOutToleranceUnit() {
		UnitsLength oldCutOutToleranceUnit = cutOutToleranceUnit;
		boolean oldCutOutToleranceUnitESet = cutOutToleranceUnitESet;
		cutOutToleranceUnit = CUT_OUT_TOLERANCE_UNIT_EDEFAULT;
		cutOutToleranceUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE_UNIT, oldCutOutToleranceUnit, CUT_OUT_TOLERANCE_UNIT_EDEFAULT, oldCutOutToleranceUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCutOutToleranceUnit() {
		return cutOutToleranceUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getCutOutUnit() {
		return cutOutUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCutOutUnit(UnitsLength newCutOutUnit) {
		UnitsLength oldCutOutUnit = cutOutUnit;
		cutOutUnit = newCutOutUnit == null ? CUT_OUT_UNIT_EDEFAULT : newCutOutUnit;
		boolean oldCutOutUnitESet = cutOutUnitESet;
		cutOutUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_UNIT, oldCutOutUnit, cutOutUnit, !oldCutOutUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCutOutUnit() {
		UnitsLength oldCutOutUnit = cutOutUnit;
		boolean oldCutOutUnitESet = cutOutUnitESet;
		cutOutUnit = CUT_OUT_UNIT_EDEFAULT;
		cutOutUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_UNIT, oldCutOutUnit, CUT_OUT_UNIT_EDEFAULT, oldCutOutUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCutOutUnit() {
		return cutOutUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTransmittance() {
		return transmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmittance(float newTransmittance) {
		float oldTransmittance = transmittance;
		transmittance = newTransmittance;
		boolean oldTransmittanceESet = transmittanceESet;
		transmittanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__TRANSMITTANCE, oldTransmittance, transmittance, !oldTransmittanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTransmittance() {
		float oldTransmittance = transmittance;
		boolean oldTransmittanceESet = transmittanceESet;
		transmittance = TRANSMITTANCE_EDEFAULT;
		transmittanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TRANSMITTANCE_RANGE_TYPE__TRANSMITTANCE, oldTransmittance, TRANSMITTANCE_EDEFAULT, oldTransmittanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTransmittance() {
		return transmittanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN:
				return getCutIn();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE:
				return getCutInTolerance();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE_UNIT:
				return getCutInToleranceUnit();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_UNIT:
				return getCutInUnit();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT:
				return getCutOut();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE:
				return getCutOutTolerance();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE_UNIT:
				return getCutOutToleranceUnit();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_UNIT:
				return getCutOutUnit();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__TRANSMITTANCE:
				return getTransmittance();
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
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN:
				setCutIn((Float)newValue);
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE:
				setCutInTolerance((Float)newValue);
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE_UNIT:
				setCutInToleranceUnit((UnitsLength)newValue);
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_UNIT:
				setCutInUnit((UnitsLength)newValue);
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT:
				setCutOut((Float)newValue);
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE:
				setCutOutTolerance((Float)newValue);
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE_UNIT:
				setCutOutToleranceUnit((UnitsLength)newValue);
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_UNIT:
				setCutOutUnit((UnitsLength)newValue);
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__TRANSMITTANCE:
				setTransmittance((Float)newValue);
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
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN:
				unsetCutIn();
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE:
				unsetCutInTolerance();
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE_UNIT:
				unsetCutInToleranceUnit();
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_UNIT:
				unsetCutInUnit();
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT:
				unsetCutOut();
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE:
				unsetCutOutTolerance();
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE_UNIT:
				unsetCutOutToleranceUnit();
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_UNIT:
				unsetCutOutUnit();
				return;
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__TRANSMITTANCE:
				unsetTransmittance();
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
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN:
				return isSetCutIn();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE:
				return isSetCutInTolerance();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE_UNIT:
				return isSetCutInToleranceUnit();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_IN_UNIT:
				return isSetCutInUnit();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT:
				return isSetCutOut();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE:
				return isSetCutOutTolerance();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE_UNIT:
				return isSetCutOutToleranceUnit();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__CUT_OUT_UNIT:
				return isSetCutOutUnit();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE__TRANSMITTANCE:
				return isSetTransmittance();
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
		result.append(" (cutIn: ");
		if (cutInESet) result.append(cutIn); else result.append("<unset>");
		result.append(", cutInTolerance: ");
		if (cutInToleranceESet) result.append(cutInTolerance); else result.append("<unset>");
		result.append(", cutInToleranceUnit: ");
		if (cutInToleranceUnitESet) result.append(cutInToleranceUnit); else result.append("<unset>");
		result.append(", cutInUnit: ");
		if (cutInUnitESet) result.append(cutInUnit); else result.append("<unset>");
		result.append(", cutOut: ");
		if (cutOutESet) result.append(cutOut); else result.append("<unset>");
		result.append(", cutOutTolerance: ");
		if (cutOutToleranceESet) result.append(cutOutTolerance); else result.append("<unset>");
		result.append(", cutOutToleranceUnit: ");
		if (cutOutToleranceUnitESet) result.append(cutOutToleranceUnit); else result.append("<unset>");
		result.append(", cutOutUnit: ");
		if (cutOutUnitESet) result.append(cutOutUnit); else result.append("<unset>");
		result.append(", transmittance: ");
		if (transmittanceESet) result.append(transmittance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TransmittanceRangeTypeImpl
