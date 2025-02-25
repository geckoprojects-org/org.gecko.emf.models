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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.PlaneType;
import org.openmicroscopy.ome.UnitsLength;
import org.openmicroscopy.ome.UnitsTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plane Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getHashSHA1 <em>Hash SHA1</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getDeltaT <em>Delta T</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getDeltaTUnit <em>Delta TUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getExposureTime <em>Exposure Time</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getExposureTimeUnit <em>Exposure Time Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getPositionXUnit <em>Position XUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getPositionYUnit <em>Position YUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getPositionZ <em>Position Z</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getPositionZUnit <em>Position ZUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getTheC <em>The C</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getTheT <em>The T</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlaneTypeImpl#getTheZ <em>The Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaneTypeImpl extends MinimalEObjectImpl.Container implements PlaneType {
	/**
	 * The default value of the '{@link #getHashSHA1() <em>Hash SHA1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashSHA1()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] HASH_SHA1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHashSHA1() <em>Hash SHA1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashSHA1()
	 * @generated
	 * @ordered
	 */
	protected byte[] hashSHA1 = HASH_SHA1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotationRef() <em>Annotation Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationRef()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationRefType> annotationRef;

	/**
	 * The default value of the '{@link #getDeltaT() <em>Delta T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT()
	 * @generated
	 * @ordered
	 */
	protected static final float DELTA_T_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDeltaT() <em>Delta T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT()
	 * @generated
	 * @ordered
	 */
	protected float deltaT = DELTA_T_EDEFAULT;

	/**
	 * This is true if the Delta T attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deltaTESet;

	/**
	 * The default value of the '{@link #getDeltaTUnit() <em>Delta TUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsTime DELTA_TUNIT_EDEFAULT = UnitsTime.S;

	/**
	 * The cached value of the '{@link #getDeltaTUnit() <em>Delta TUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsTime deltaTUnit = DELTA_TUNIT_EDEFAULT;

	/**
	 * This is true if the Delta TUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deltaTUnitESet;

	/**
	 * The default value of the '{@link #getExposureTime() <em>Exposure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureTime()
	 * @generated
	 * @ordered
	 */
	protected static final float EXPOSURE_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getExposureTime() <em>Exposure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureTime()
	 * @generated
	 * @ordered
	 */
	protected float exposureTime = EXPOSURE_TIME_EDEFAULT;

	/**
	 * This is true if the Exposure Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exposureTimeESet;

	/**
	 * The default value of the '{@link #getExposureTimeUnit() <em>Exposure Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsTime EXPOSURE_TIME_UNIT_EDEFAULT = UnitsTime.S;

	/**
	 * The cached value of the '{@link #getExposureTimeUnit() <em>Exposure Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsTime exposureTimeUnit = EXPOSURE_TIME_UNIT_EDEFAULT;

	/**
	 * This is true if the Exposure Time Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exposureTimeUnitESet;

	/**
	 * The default value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected float positionX = POSITION_X_EDEFAULT;

	/**
	 * This is true if the Position X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionXESet;

	/**
	 * The default value of the '{@link #getPositionXUnit() <em>Position XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength POSITION_XUNIT_EDEFAULT = UnitsLength.REFERENCE_FRAME;

	/**
	 * The cached value of the '{@link #getPositionXUnit() <em>Position XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength positionXUnit = POSITION_XUNIT_EDEFAULT;

	/**
	 * This is true if the Position XUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionXUnitESet;

	/**
	 * The default value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected float positionY = POSITION_Y_EDEFAULT;

	/**
	 * This is true if the Position Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionYESet;

	/**
	 * The default value of the '{@link #getPositionYUnit() <em>Position YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionYUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength POSITION_YUNIT_EDEFAULT = UnitsLength.REFERENCE_FRAME;

	/**
	 * The cached value of the '{@link #getPositionYUnit() <em>Position YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionYUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength positionYUnit = POSITION_YUNIT_EDEFAULT;

	/**
	 * This is true if the Position YUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionYUnitESet;

	/**
	 * The default value of the '{@link #getPositionZ() <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZ()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_Z_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPositionZ() <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZ()
	 * @generated
	 * @ordered
	 */
	protected float positionZ = POSITION_Z_EDEFAULT;

	/**
	 * This is true if the Position Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionZESet;

	/**
	 * The default value of the '{@link #getPositionZUnit() <em>Position ZUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength POSITION_ZUNIT_EDEFAULT = UnitsLength.REFERENCE_FRAME;

	/**
	 * The cached value of the '{@link #getPositionZUnit() <em>Position ZUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength positionZUnit = POSITION_ZUNIT_EDEFAULT;

	/**
	 * This is true if the Position ZUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionZUnitESet;

	/**
	 * The default value of the '{@link #getTheC() <em>The C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheC()
	 * @generated
	 * @ordered
	 */
	protected static final int THE_C_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTheC() <em>The C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheC()
	 * @generated
	 * @ordered
	 */
	protected int theC = THE_C_EDEFAULT;

	/**
	 * This is true if the The C attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean theCESet;

	/**
	 * The default value of the '{@link #getTheT() <em>The T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheT()
	 * @generated
	 * @ordered
	 */
	protected static final int THE_T_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTheT() <em>The T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheT()
	 * @generated
	 * @ordered
	 */
	protected int theT = THE_T_EDEFAULT;

	/**
	 * This is true if the The T attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean theTESet;

	/**
	 * The default value of the '{@link #getTheZ() <em>The Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheZ()
	 * @generated
	 * @ordered
	 */
	protected static final int THE_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTheZ() <em>The Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheZ()
	 * @generated
	 * @ordered
	 */
	protected int theZ = THE_Z_EDEFAULT;

	/**
	 * This is true if the The Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean theZESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaneTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getPlaneType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getHashSHA1() {
		return hashSHA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHashSHA1(byte[] newHashSHA1) {
		byte[] oldHashSHA1 = hashSHA1;
		hashSHA1 = newHashSHA1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__HASH_SHA1, oldHashSHA1, hashSHA1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.PLANE_TYPE__ANNOTATION_REF);
		}
		return annotationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDeltaT() {
		return deltaT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaT(float newDeltaT) {
		float oldDeltaT = deltaT;
		deltaT = newDeltaT;
		boolean oldDeltaTESet = deltaTESet;
		deltaTESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__DELTA_T, oldDeltaT, deltaT, !oldDeltaTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDeltaT() {
		float oldDeltaT = deltaT;
		boolean oldDeltaTESet = deltaTESet;
		deltaT = DELTA_T_EDEFAULT;
		deltaTESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__DELTA_T, oldDeltaT, DELTA_T_EDEFAULT, oldDeltaTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDeltaT() {
		return deltaTESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsTime getDeltaTUnit() {
		return deltaTUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaTUnit(UnitsTime newDeltaTUnit) {
		UnitsTime oldDeltaTUnit = deltaTUnit;
		deltaTUnit = newDeltaTUnit == null ? DELTA_TUNIT_EDEFAULT : newDeltaTUnit;
		boolean oldDeltaTUnitESet = deltaTUnitESet;
		deltaTUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__DELTA_TUNIT, oldDeltaTUnit, deltaTUnit, !oldDeltaTUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDeltaTUnit() {
		UnitsTime oldDeltaTUnit = deltaTUnit;
		boolean oldDeltaTUnitESet = deltaTUnitESet;
		deltaTUnit = DELTA_TUNIT_EDEFAULT;
		deltaTUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__DELTA_TUNIT, oldDeltaTUnit, DELTA_TUNIT_EDEFAULT, oldDeltaTUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDeltaTUnit() {
		return deltaTUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getExposureTime() {
		return exposureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExposureTime(float newExposureTime) {
		float oldExposureTime = exposureTime;
		exposureTime = newExposureTime;
		boolean oldExposureTimeESet = exposureTimeESet;
		exposureTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__EXPOSURE_TIME, oldExposureTime, exposureTime, !oldExposureTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExposureTime() {
		float oldExposureTime = exposureTime;
		boolean oldExposureTimeESet = exposureTimeESet;
		exposureTime = EXPOSURE_TIME_EDEFAULT;
		exposureTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__EXPOSURE_TIME, oldExposureTime, EXPOSURE_TIME_EDEFAULT, oldExposureTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExposureTime() {
		return exposureTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsTime getExposureTimeUnit() {
		return exposureTimeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExposureTimeUnit(UnitsTime newExposureTimeUnit) {
		UnitsTime oldExposureTimeUnit = exposureTimeUnit;
		exposureTimeUnit = newExposureTimeUnit == null ? EXPOSURE_TIME_UNIT_EDEFAULT : newExposureTimeUnit;
		boolean oldExposureTimeUnitESet = exposureTimeUnitESet;
		exposureTimeUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__EXPOSURE_TIME_UNIT, oldExposureTimeUnit, exposureTimeUnit, !oldExposureTimeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExposureTimeUnit() {
		UnitsTime oldExposureTimeUnit = exposureTimeUnit;
		boolean oldExposureTimeUnitESet = exposureTimeUnitESet;
		exposureTimeUnit = EXPOSURE_TIME_UNIT_EDEFAULT;
		exposureTimeUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__EXPOSURE_TIME_UNIT, oldExposureTimeUnit, EXPOSURE_TIME_UNIT_EDEFAULT, oldExposureTimeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExposureTimeUnit() {
		return exposureTimeUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionX(float newPositionX) {
		float oldPositionX = positionX;
		positionX = newPositionX;
		boolean oldPositionXESet = positionXESet;
		positionXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__POSITION_X, oldPositionX, positionX, !oldPositionXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPositionX() {
		float oldPositionX = positionX;
		boolean oldPositionXESet = positionXESet;
		positionX = POSITION_X_EDEFAULT;
		positionXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__POSITION_X, oldPositionX, POSITION_X_EDEFAULT, oldPositionXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPositionX() {
		return positionXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getPositionXUnit() {
		return positionXUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionXUnit(UnitsLength newPositionXUnit) {
		UnitsLength oldPositionXUnit = positionXUnit;
		positionXUnit = newPositionXUnit == null ? POSITION_XUNIT_EDEFAULT : newPositionXUnit;
		boolean oldPositionXUnitESet = positionXUnitESet;
		positionXUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__POSITION_XUNIT, oldPositionXUnit, positionXUnit, !oldPositionXUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPositionXUnit() {
		UnitsLength oldPositionXUnit = positionXUnit;
		boolean oldPositionXUnitESet = positionXUnitESet;
		positionXUnit = POSITION_XUNIT_EDEFAULT;
		positionXUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__POSITION_XUNIT, oldPositionXUnit, POSITION_XUNIT_EDEFAULT, oldPositionXUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPositionXUnit() {
		return positionXUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionY(float newPositionY) {
		float oldPositionY = positionY;
		positionY = newPositionY;
		boolean oldPositionYESet = positionYESet;
		positionYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__POSITION_Y, oldPositionY, positionY, !oldPositionYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPositionY() {
		float oldPositionY = positionY;
		boolean oldPositionYESet = positionYESet;
		positionY = POSITION_Y_EDEFAULT;
		positionYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__POSITION_Y, oldPositionY, POSITION_Y_EDEFAULT, oldPositionYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPositionY() {
		return positionYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getPositionYUnit() {
		return positionYUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionYUnit(UnitsLength newPositionYUnit) {
		UnitsLength oldPositionYUnit = positionYUnit;
		positionYUnit = newPositionYUnit == null ? POSITION_YUNIT_EDEFAULT : newPositionYUnit;
		boolean oldPositionYUnitESet = positionYUnitESet;
		positionYUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__POSITION_YUNIT, oldPositionYUnit, positionYUnit, !oldPositionYUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPositionYUnit() {
		UnitsLength oldPositionYUnit = positionYUnit;
		boolean oldPositionYUnitESet = positionYUnitESet;
		positionYUnit = POSITION_YUNIT_EDEFAULT;
		positionYUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__POSITION_YUNIT, oldPositionYUnit, POSITION_YUNIT_EDEFAULT, oldPositionYUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPositionYUnit() {
		return positionYUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPositionZ() {
		return positionZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionZ(float newPositionZ) {
		float oldPositionZ = positionZ;
		positionZ = newPositionZ;
		boolean oldPositionZESet = positionZESet;
		positionZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__POSITION_Z, oldPositionZ, positionZ, !oldPositionZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPositionZ() {
		float oldPositionZ = positionZ;
		boolean oldPositionZESet = positionZESet;
		positionZ = POSITION_Z_EDEFAULT;
		positionZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__POSITION_Z, oldPositionZ, POSITION_Z_EDEFAULT, oldPositionZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPositionZ() {
		return positionZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getPositionZUnit() {
		return positionZUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionZUnit(UnitsLength newPositionZUnit) {
		UnitsLength oldPositionZUnit = positionZUnit;
		positionZUnit = newPositionZUnit == null ? POSITION_ZUNIT_EDEFAULT : newPositionZUnit;
		boolean oldPositionZUnitESet = positionZUnitESet;
		positionZUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__POSITION_ZUNIT, oldPositionZUnit, positionZUnit, !oldPositionZUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPositionZUnit() {
		UnitsLength oldPositionZUnit = positionZUnit;
		boolean oldPositionZUnitESet = positionZUnitESet;
		positionZUnit = POSITION_ZUNIT_EDEFAULT;
		positionZUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__POSITION_ZUNIT, oldPositionZUnit, POSITION_ZUNIT_EDEFAULT, oldPositionZUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPositionZUnit() {
		return positionZUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTheC() {
		return theC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheC(int newTheC) {
		int oldTheC = theC;
		theC = newTheC;
		boolean oldTheCESet = theCESet;
		theCESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__THE_C, oldTheC, theC, !oldTheCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTheC() {
		int oldTheC = theC;
		boolean oldTheCESet = theCESet;
		theC = THE_C_EDEFAULT;
		theCESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__THE_C, oldTheC, THE_C_EDEFAULT, oldTheCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTheC() {
		return theCESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTheT() {
		return theT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheT(int newTheT) {
		int oldTheT = theT;
		theT = newTheT;
		boolean oldTheTESet = theTESet;
		theTESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__THE_T, oldTheT, theT, !oldTheTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTheT() {
		int oldTheT = theT;
		boolean oldTheTESet = theTESet;
		theT = THE_T_EDEFAULT;
		theTESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__THE_T, oldTheT, THE_T_EDEFAULT, oldTheTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTheT() {
		return theTESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTheZ() {
		return theZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheZ(int newTheZ) {
		int oldTheZ = theZ;
		theZ = newTheZ;
		boolean oldTheZESet = theZESet;
		theZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLANE_TYPE__THE_Z, oldTheZ, theZ, !oldTheZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTheZ() {
		int oldTheZ = theZ;
		boolean oldTheZESet = theZESet;
		theZ = THE_Z_EDEFAULT;
		theZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLANE_TYPE__THE_Z, oldTheZ, THE_Z_EDEFAULT, oldTheZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTheZ() {
		return theZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.PLANE_TYPE__ANNOTATION_REF:
				return ((InternalEList<?>)getAnnotationRef()).basicRemove(otherEnd, msgs);
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
			case OMEPackage.PLANE_TYPE__HASH_SHA1:
				return getHashSHA1();
			case OMEPackage.PLANE_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.PLANE_TYPE__DELTA_T:
				return getDeltaT();
			case OMEPackage.PLANE_TYPE__DELTA_TUNIT:
				return getDeltaTUnit();
			case OMEPackage.PLANE_TYPE__EXPOSURE_TIME:
				return getExposureTime();
			case OMEPackage.PLANE_TYPE__EXPOSURE_TIME_UNIT:
				return getExposureTimeUnit();
			case OMEPackage.PLANE_TYPE__POSITION_X:
				return getPositionX();
			case OMEPackage.PLANE_TYPE__POSITION_XUNIT:
				return getPositionXUnit();
			case OMEPackage.PLANE_TYPE__POSITION_Y:
				return getPositionY();
			case OMEPackage.PLANE_TYPE__POSITION_YUNIT:
				return getPositionYUnit();
			case OMEPackage.PLANE_TYPE__POSITION_Z:
				return getPositionZ();
			case OMEPackage.PLANE_TYPE__POSITION_ZUNIT:
				return getPositionZUnit();
			case OMEPackage.PLANE_TYPE__THE_C:
				return getTheC();
			case OMEPackage.PLANE_TYPE__THE_T:
				return getTheT();
			case OMEPackage.PLANE_TYPE__THE_Z:
				return getTheZ();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMEPackage.PLANE_TYPE__HASH_SHA1:
				setHashSHA1((byte[])newValue);
				return;
			case OMEPackage.PLANE_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.PLANE_TYPE__DELTA_T:
				setDeltaT((Float)newValue);
				return;
			case OMEPackage.PLANE_TYPE__DELTA_TUNIT:
				setDeltaTUnit((UnitsTime)newValue);
				return;
			case OMEPackage.PLANE_TYPE__EXPOSURE_TIME:
				setExposureTime((Float)newValue);
				return;
			case OMEPackage.PLANE_TYPE__EXPOSURE_TIME_UNIT:
				setExposureTimeUnit((UnitsTime)newValue);
				return;
			case OMEPackage.PLANE_TYPE__POSITION_X:
				setPositionX((Float)newValue);
				return;
			case OMEPackage.PLANE_TYPE__POSITION_XUNIT:
				setPositionXUnit((UnitsLength)newValue);
				return;
			case OMEPackage.PLANE_TYPE__POSITION_Y:
				setPositionY((Float)newValue);
				return;
			case OMEPackage.PLANE_TYPE__POSITION_YUNIT:
				setPositionYUnit((UnitsLength)newValue);
				return;
			case OMEPackage.PLANE_TYPE__POSITION_Z:
				setPositionZ((Float)newValue);
				return;
			case OMEPackage.PLANE_TYPE__POSITION_ZUNIT:
				setPositionZUnit((UnitsLength)newValue);
				return;
			case OMEPackage.PLANE_TYPE__THE_C:
				setTheC((Integer)newValue);
				return;
			case OMEPackage.PLANE_TYPE__THE_T:
				setTheT((Integer)newValue);
				return;
			case OMEPackage.PLANE_TYPE__THE_Z:
				setTheZ((Integer)newValue);
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
			case OMEPackage.PLANE_TYPE__HASH_SHA1:
				setHashSHA1(HASH_SHA1_EDEFAULT);
				return;
			case OMEPackage.PLANE_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.PLANE_TYPE__DELTA_T:
				unsetDeltaT();
				return;
			case OMEPackage.PLANE_TYPE__DELTA_TUNIT:
				unsetDeltaTUnit();
				return;
			case OMEPackage.PLANE_TYPE__EXPOSURE_TIME:
				unsetExposureTime();
				return;
			case OMEPackage.PLANE_TYPE__EXPOSURE_TIME_UNIT:
				unsetExposureTimeUnit();
				return;
			case OMEPackage.PLANE_TYPE__POSITION_X:
				unsetPositionX();
				return;
			case OMEPackage.PLANE_TYPE__POSITION_XUNIT:
				unsetPositionXUnit();
				return;
			case OMEPackage.PLANE_TYPE__POSITION_Y:
				unsetPositionY();
				return;
			case OMEPackage.PLANE_TYPE__POSITION_YUNIT:
				unsetPositionYUnit();
				return;
			case OMEPackage.PLANE_TYPE__POSITION_Z:
				unsetPositionZ();
				return;
			case OMEPackage.PLANE_TYPE__POSITION_ZUNIT:
				unsetPositionZUnit();
				return;
			case OMEPackage.PLANE_TYPE__THE_C:
				unsetTheC();
				return;
			case OMEPackage.PLANE_TYPE__THE_T:
				unsetTheT();
				return;
			case OMEPackage.PLANE_TYPE__THE_Z:
				unsetTheZ();
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
			case OMEPackage.PLANE_TYPE__HASH_SHA1:
				return HASH_SHA1_EDEFAULT == null ? hashSHA1 != null : !HASH_SHA1_EDEFAULT.equals(hashSHA1);
			case OMEPackage.PLANE_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.PLANE_TYPE__DELTA_T:
				return isSetDeltaT();
			case OMEPackage.PLANE_TYPE__DELTA_TUNIT:
				return isSetDeltaTUnit();
			case OMEPackage.PLANE_TYPE__EXPOSURE_TIME:
				return isSetExposureTime();
			case OMEPackage.PLANE_TYPE__EXPOSURE_TIME_UNIT:
				return isSetExposureTimeUnit();
			case OMEPackage.PLANE_TYPE__POSITION_X:
				return isSetPositionX();
			case OMEPackage.PLANE_TYPE__POSITION_XUNIT:
				return isSetPositionXUnit();
			case OMEPackage.PLANE_TYPE__POSITION_Y:
				return isSetPositionY();
			case OMEPackage.PLANE_TYPE__POSITION_YUNIT:
				return isSetPositionYUnit();
			case OMEPackage.PLANE_TYPE__POSITION_Z:
				return isSetPositionZ();
			case OMEPackage.PLANE_TYPE__POSITION_ZUNIT:
				return isSetPositionZUnit();
			case OMEPackage.PLANE_TYPE__THE_C:
				return isSetTheC();
			case OMEPackage.PLANE_TYPE__THE_T:
				return isSetTheT();
			case OMEPackage.PLANE_TYPE__THE_Z:
				return isSetTheZ();
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
		result.append(" (hashSHA1: ");
		result.append(hashSHA1);
		result.append(", deltaT: ");
		if (deltaTESet) result.append(deltaT); else result.append("<unset>");
		result.append(", deltaTUnit: ");
		if (deltaTUnitESet) result.append(deltaTUnit); else result.append("<unset>");
		result.append(", exposureTime: ");
		if (exposureTimeESet) result.append(exposureTime); else result.append("<unset>");
		result.append(", exposureTimeUnit: ");
		if (exposureTimeUnitESet) result.append(exposureTimeUnit); else result.append("<unset>");
		result.append(", positionX: ");
		if (positionXESet) result.append(positionX); else result.append("<unset>");
		result.append(", positionXUnit: ");
		if (positionXUnitESet) result.append(positionXUnit); else result.append("<unset>");
		result.append(", positionY: ");
		if (positionYESet) result.append(positionY); else result.append("<unset>");
		result.append(", positionYUnit: ");
		if (positionYUnitESet) result.append(positionYUnit); else result.append("<unset>");
		result.append(", positionZ: ");
		if (positionZESet) result.append(positionZ); else result.append("<unset>");
		result.append(", positionZUnit: ");
		if (positionZUnitESet) result.append(positionZUnit); else result.append("<unset>");
		result.append(", theC: ");
		if (theCESet) result.append(theC); else result.append("<unset>");
		result.append(", theT: ");
		if (theTESet) result.append(theT); else result.append("<unset>");
		result.append(", theZ: ");
		if (theZESet) result.append(theZ); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PlaneTypeImpl
