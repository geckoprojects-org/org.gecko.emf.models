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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.CorrectionType;
import org.openmicroscopy.ome.ImmersionType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.ObjectiveType;
import org.openmicroscopy.ome.UnitsLength;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveTypeImpl#getCalibratedMagnification <em>Calibrated Magnification</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveTypeImpl#getCorrection <em>Correction</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveTypeImpl#getImmersion <em>Immersion</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveTypeImpl#isIris <em>Iris</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveTypeImpl#getLensNA <em>Lens NA</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveTypeImpl#getNominalMagnification <em>Nominal Magnification</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveTypeImpl#getWorkingDistance <em>Working Distance</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveTypeImpl#getWorkingDistanceUnit <em>Working Distance Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveTypeImpl extends ManufacturerSpecImpl implements ObjectiveType {
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
	 * The default value of the '{@link #getCalibratedMagnification() <em>Calibrated Magnification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibratedMagnification()
	 * @generated
	 * @ordered
	 */
	protected static final float CALIBRATED_MAGNIFICATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCalibratedMagnification() <em>Calibrated Magnification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibratedMagnification()
	 * @generated
	 * @ordered
	 */
	protected float calibratedMagnification = CALIBRATED_MAGNIFICATION_EDEFAULT;

	/**
	 * This is true if the Calibrated Magnification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean calibratedMagnificationESet;

	/**
	 * The default value of the '{@link #getCorrection() <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrection()
	 * @generated
	 * @ordered
	 */
	protected static final CorrectionType CORRECTION_EDEFAULT = CorrectionType.UV;

	/**
	 * The cached value of the '{@link #getCorrection() <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrection()
	 * @generated
	 * @ordered
	 */
	protected CorrectionType correction = CORRECTION_EDEFAULT;

	/**
	 * This is true if the Correction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean correctionESet;

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
	 * The default value of the '{@link #getImmersion() <em>Immersion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmersion()
	 * @generated
	 * @ordered
	 */
	protected static final ImmersionType IMMERSION_EDEFAULT = ImmersionType.OIL;

	/**
	 * The cached value of the '{@link #getImmersion() <em>Immersion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmersion()
	 * @generated
	 * @ordered
	 */
	protected ImmersionType immersion = IMMERSION_EDEFAULT;

	/**
	 * This is true if the Immersion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean immersionESet;

	/**
	 * The default value of the '{@link #isIris() <em>Iris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIris()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IRIS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIris() <em>Iris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIris()
	 * @generated
	 * @ordered
	 */
	protected boolean iris = IRIS_EDEFAULT;

	/**
	 * This is true if the Iris attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean irisESet;

	/**
	 * The default value of the '{@link #getLensNA() <em>Lens NA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLensNA()
	 * @generated
	 * @ordered
	 */
	protected static final float LENS_NA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLensNA() <em>Lens NA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLensNA()
	 * @generated
	 * @ordered
	 */
	protected float lensNA = LENS_NA_EDEFAULT;

	/**
	 * This is true if the Lens NA attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lensNAESet;

	/**
	 * The default value of the '{@link #getNominalMagnification() <em>Nominal Magnification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalMagnification()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_MAGNIFICATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalMagnification() <em>Nominal Magnification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalMagnification()
	 * @generated
	 * @ordered
	 */
	protected float nominalMagnification = NOMINAL_MAGNIFICATION_EDEFAULT;

	/**
	 * This is true if the Nominal Magnification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalMagnificationESet;

	/**
	 * The default value of the '{@link #getWorkingDistance() <em>Working Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDistance()
	 * @generated
	 * @ordered
	 */
	protected static final float WORKING_DISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWorkingDistance() <em>Working Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDistance()
	 * @generated
	 * @ordered
	 */
	protected float workingDistance = WORKING_DISTANCE_EDEFAULT;

	/**
	 * This is true if the Working Distance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workingDistanceESet;

	/**
	 * The default value of the '{@link #getWorkingDistanceUnit() <em>Working Distance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDistanceUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength WORKING_DISTANCE_UNIT_EDEFAULT = UnitsLength.ΜM;

	/**
	 * The cached value of the '{@link #getWorkingDistanceUnit() <em>Working Distance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDistanceUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength workingDistanceUnit = WORKING_DISTANCE_UNIT_EDEFAULT;

	/**
	 * This is true if the Working Distance Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workingDistanceUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getObjectiveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.OBJECTIVE_TYPE__ANNOTATION_REF);
		}
		return annotationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCalibratedMagnification() {
		return calibratedMagnification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalibratedMagnification(float newCalibratedMagnification) {
		float oldCalibratedMagnification = calibratedMagnification;
		calibratedMagnification = newCalibratedMagnification;
		boolean oldCalibratedMagnificationESet = calibratedMagnificationESet;
		calibratedMagnificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_TYPE__CALIBRATED_MAGNIFICATION, oldCalibratedMagnification, calibratedMagnification, !oldCalibratedMagnificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCalibratedMagnification() {
		float oldCalibratedMagnification = calibratedMagnification;
		boolean oldCalibratedMagnificationESet = calibratedMagnificationESet;
		calibratedMagnification = CALIBRATED_MAGNIFICATION_EDEFAULT;
		calibratedMagnificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.OBJECTIVE_TYPE__CALIBRATED_MAGNIFICATION, oldCalibratedMagnification, CALIBRATED_MAGNIFICATION_EDEFAULT, oldCalibratedMagnificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCalibratedMagnification() {
		return calibratedMagnificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorrectionType getCorrection() {
		return correction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrection(CorrectionType newCorrection) {
		CorrectionType oldCorrection = correction;
		correction = newCorrection == null ? CORRECTION_EDEFAULT : newCorrection;
		boolean oldCorrectionESet = correctionESet;
		correctionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_TYPE__CORRECTION, oldCorrection, correction, !oldCorrectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCorrection() {
		CorrectionType oldCorrection = correction;
		boolean oldCorrectionESet = correctionESet;
		correction = CORRECTION_EDEFAULT;
		correctionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.OBJECTIVE_TYPE__CORRECTION, oldCorrection, CORRECTION_EDEFAULT, oldCorrectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCorrection() {
		return correctionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmersionType getImmersion() {
		return immersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImmersion(ImmersionType newImmersion) {
		ImmersionType oldImmersion = immersion;
		immersion = newImmersion == null ? IMMERSION_EDEFAULT : newImmersion;
		boolean oldImmersionESet = immersionESet;
		immersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_TYPE__IMMERSION, oldImmersion, immersion, !oldImmersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetImmersion() {
		ImmersionType oldImmersion = immersion;
		boolean oldImmersionESet = immersionESet;
		immersion = IMMERSION_EDEFAULT;
		immersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.OBJECTIVE_TYPE__IMMERSION, oldImmersion, IMMERSION_EDEFAULT, oldImmersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetImmersion() {
		return immersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIris() {
		return iris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIris(boolean newIris) {
		boolean oldIris = iris;
		iris = newIris;
		boolean oldIrisESet = irisESet;
		irisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_TYPE__IRIS, oldIris, iris, !oldIrisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIris() {
		boolean oldIris = iris;
		boolean oldIrisESet = irisESet;
		iris = IRIS_EDEFAULT;
		irisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.OBJECTIVE_TYPE__IRIS, oldIris, IRIS_EDEFAULT, oldIrisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIris() {
		return irisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLensNA() {
		return lensNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLensNA(float newLensNA) {
		float oldLensNA = lensNA;
		lensNA = newLensNA;
		boolean oldLensNAESet = lensNAESet;
		lensNAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_TYPE__LENS_NA, oldLensNA, lensNA, !oldLensNAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLensNA() {
		float oldLensNA = lensNA;
		boolean oldLensNAESet = lensNAESet;
		lensNA = LENS_NA_EDEFAULT;
		lensNAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.OBJECTIVE_TYPE__LENS_NA, oldLensNA, LENS_NA_EDEFAULT, oldLensNAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLensNA() {
		return lensNAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getNominalMagnification() {
		return nominalMagnification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNominalMagnification(float newNominalMagnification) {
		float oldNominalMagnification = nominalMagnification;
		nominalMagnification = newNominalMagnification;
		boolean oldNominalMagnificationESet = nominalMagnificationESet;
		nominalMagnificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_TYPE__NOMINAL_MAGNIFICATION, oldNominalMagnification, nominalMagnification, !oldNominalMagnificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNominalMagnification() {
		float oldNominalMagnification = nominalMagnification;
		boolean oldNominalMagnificationESet = nominalMagnificationESet;
		nominalMagnification = NOMINAL_MAGNIFICATION_EDEFAULT;
		nominalMagnificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.OBJECTIVE_TYPE__NOMINAL_MAGNIFICATION, oldNominalMagnification, NOMINAL_MAGNIFICATION_EDEFAULT, oldNominalMagnificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNominalMagnification() {
		return nominalMagnificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWorkingDistance() {
		return workingDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkingDistance(float newWorkingDistance) {
		float oldWorkingDistance = workingDistance;
		workingDistance = newWorkingDistance;
		boolean oldWorkingDistanceESet = workingDistanceESet;
		workingDistanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_TYPE__WORKING_DISTANCE, oldWorkingDistance, workingDistance, !oldWorkingDistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWorkingDistance() {
		float oldWorkingDistance = workingDistance;
		boolean oldWorkingDistanceESet = workingDistanceESet;
		workingDistance = WORKING_DISTANCE_EDEFAULT;
		workingDistanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.OBJECTIVE_TYPE__WORKING_DISTANCE, oldWorkingDistance, WORKING_DISTANCE_EDEFAULT, oldWorkingDistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWorkingDistance() {
		return workingDistanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getWorkingDistanceUnit() {
		return workingDistanceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkingDistanceUnit(UnitsLength newWorkingDistanceUnit) {
		UnitsLength oldWorkingDistanceUnit = workingDistanceUnit;
		workingDistanceUnit = newWorkingDistanceUnit == null ? WORKING_DISTANCE_UNIT_EDEFAULT : newWorkingDistanceUnit;
		boolean oldWorkingDistanceUnitESet = workingDistanceUnitESet;
		workingDistanceUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_TYPE__WORKING_DISTANCE_UNIT, oldWorkingDistanceUnit, workingDistanceUnit, !oldWorkingDistanceUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWorkingDistanceUnit() {
		UnitsLength oldWorkingDistanceUnit = workingDistanceUnit;
		boolean oldWorkingDistanceUnitESet = workingDistanceUnitESet;
		workingDistanceUnit = WORKING_DISTANCE_UNIT_EDEFAULT;
		workingDistanceUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.OBJECTIVE_TYPE__WORKING_DISTANCE_UNIT, oldWorkingDistanceUnit, WORKING_DISTANCE_UNIT_EDEFAULT, oldWorkingDistanceUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWorkingDistanceUnit() {
		return workingDistanceUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.OBJECTIVE_TYPE__ANNOTATION_REF:
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
			case OMEPackage.OBJECTIVE_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.OBJECTIVE_TYPE__CALIBRATED_MAGNIFICATION:
				return getCalibratedMagnification();
			case OMEPackage.OBJECTIVE_TYPE__CORRECTION:
				return getCorrection();
			case OMEPackage.OBJECTIVE_TYPE__ID:
				return getID();
			case OMEPackage.OBJECTIVE_TYPE__IMMERSION:
				return getImmersion();
			case OMEPackage.OBJECTIVE_TYPE__IRIS:
				return isIris();
			case OMEPackage.OBJECTIVE_TYPE__LENS_NA:
				return getLensNA();
			case OMEPackage.OBJECTIVE_TYPE__NOMINAL_MAGNIFICATION:
				return getNominalMagnification();
			case OMEPackage.OBJECTIVE_TYPE__WORKING_DISTANCE:
				return getWorkingDistance();
			case OMEPackage.OBJECTIVE_TYPE__WORKING_DISTANCE_UNIT:
				return getWorkingDistanceUnit();
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
			case OMEPackage.OBJECTIVE_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.OBJECTIVE_TYPE__CALIBRATED_MAGNIFICATION:
				setCalibratedMagnification((Float)newValue);
				return;
			case OMEPackage.OBJECTIVE_TYPE__CORRECTION:
				setCorrection((CorrectionType)newValue);
				return;
			case OMEPackage.OBJECTIVE_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.OBJECTIVE_TYPE__IMMERSION:
				setImmersion((ImmersionType)newValue);
				return;
			case OMEPackage.OBJECTIVE_TYPE__IRIS:
				setIris((Boolean)newValue);
				return;
			case OMEPackage.OBJECTIVE_TYPE__LENS_NA:
				setLensNA((Float)newValue);
				return;
			case OMEPackage.OBJECTIVE_TYPE__NOMINAL_MAGNIFICATION:
				setNominalMagnification((Float)newValue);
				return;
			case OMEPackage.OBJECTIVE_TYPE__WORKING_DISTANCE:
				setWorkingDistance((Float)newValue);
				return;
			case OMEPackage.OBJECTIVE_TYPE__WORKING_DISTANCE_UNIT:
				setWorkingDistanceUnit((UnitsLength)newValue);
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
			case OMEPackage.OBJECTIVE_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.OBJECTIVE_TYPE__CALIBRATED_MAGNIFICATION:
				unsetCalibratedMagnification();
				return;
			case OMEPackage.OBJECTIVE_TYPE__CORRECTION:
				unsetCorrection();
				return;
			case OMEPackage.OBJECTIVE_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.OBJECTIVE_TYPE__IMMERSION:
				unsetImmersion();
				return;
			case OMEPackage.OBJECTIVE_TYPE__IRIS:
				unsetIris();
				return;
			case OMEPackage.OBJECTIVE_TYPE__LENS_NA:
				unsetLensNA();
				return;
			case OMEPackage.OBJECTIVE_TYPE__NOMINAL_MAGNIFICATION:
				unsetNominalMagnification();
				return;
			case OMEPackage.OBJECTIVE_TYPE__WORKING_DISTANCE:
				unsetWorkingDistance();
				return;
			case OMEPackage.OBJECTIVE_TYPE__WORKING_DISTANCE_UNIT:
				unsetWorkingDistanceUnit();
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
			case OMEPackage.OBJECTIVE_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.OBJECTIVE_TYPE__CALIBRATED_MAGNIFICATION:
				return isSetCalibratedMagnification();
			case OMEPackage.OBJECTIVE_TYPE__CORRECTION:
				return isSetCorrection();
			case OMEPackage.OBJECTIVE_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.OBJECTIVE_TYPE__IMMERSION:
				return isSetImmersion();
			case OMEPackage.OBJECTIVE_TYPE__IRIS:
				return isSetIris();
			case OMEPackage.OBJECTIVE_TYPE__LENS_NA:
				return isSetLensNA();
			case OMEPackage.OBJECTIVE_TYPE__NOMINAL_MAGNIFICATION:
				return isSetNominalMagnification();
			case OMEPackage.OBJECTIVE_TYPE__WORKING_DISTANCE:
				return isSetWorkingDistance();
			case OMEPackage.OBJECTIVE_TYPE__WORKING_DISTANCE_UNIT:
				return isSetWorkingDistanceUnit();
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
		result.append(" (calibratedMagnification: ");
		if (calibratedMagnificationESet) result.append(calibratedMagnification); else result.append("<unset>");
		result.append(", correction: ");
		if (correctionESet) result.append(correction); else result.append("<unset>");
		result.append(", iD: ");
		result.append(iD);
		result.append(", immersion: ");
		if (immersionESet) result.append(immersion); else result.append("<unset>");
		result.append(", iris: ");
		if (irisESet) result.append(iris); else result.append("<unset>");
		result.append(", lensNA: ");
		if (lensNAESet) result.append(lensNA); else result.append("<unset>");
		result.append(", nominalMagnification: ");
		if (nominalMagnificationESet) result.append(nominalMagnification); else result.append("<unset>");
		result.append(", workingDistance: ");
		if (workingDistanceESet) result.append(workingDistance); else result.append("<unset>");
		result.append(", workingDistanceUnit: ");
		if (workingDistanceUnitESet) result.append(workingDistanceUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ObjectiveTypeImpl
