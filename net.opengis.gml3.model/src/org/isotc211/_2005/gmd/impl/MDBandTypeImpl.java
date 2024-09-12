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
package org.isotc211._2005.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.RealPropertyType;
import org.isotc211._2005.gco.UomLengthPropertyType;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDBandType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Band Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDBandTypeImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDBandTypeImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDBandTypeImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDBandTypeImpl#getPeakResponse <em>Peak Response</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDBandTypeImpl#getBitsPerValue <em>Bits Per Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDBandTypeImpl#getToneGradation <em>Tone Gradation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDBandTypeImpl#getScaleFactor <em>Scale Factor</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDBandTypeImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDBandTypeImpl extends MDRangeDimensionTypeImpl implements MDBandType {
	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected RealPropertyType maxValue;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected RealPropertyType minValue;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected UomLengthPropertyType units;

	/**
	 * The cached value of the '{@link #getPeakResponse() <em>Peak Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakResponse()
	 * @generated
	 * @ordered
	 */
	protected RealPropertyType peakResponse;

	/**
	 * The cached value of the '{@link #getBitsPerValue() <em>Bits Per Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitsPerValue()
	 * @generated
	 * @ordered
	 */
	protected IntegerPropertyType bitsPerValue;

	/**
	 * The cached value of the '{@link #getToneGradation() <em>Tone Gradation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToneGradation()
	 * @generated
	 * @ordered
	 */
	protected IntegerPropertyType toneGradation;

	/**
	 * The cached value of the '{@link #getScaleFactor() <em>Scale Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleFactor()
	 * @generated
	 * @ordered
	 */
	protected RealPropertyType scaleFactor;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected RealPropertyType offset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDBandTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDBandType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealPropertyType getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValue(RealPropertyType newMaxValue, NotificationChain msgs) {
		RealPropertyType oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__MAX_VALUE, oldMaxValue, newMaxValue);
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
	public void setMaxValue(RealPropertyType newMaxValue) {
		if (newMaxValue != maxValue) {
			NotificationChain msgs = null;
			if (maxValue != null)
				msgs = ((InternalEObject)maxValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__MAX_VALUE, null, msgs);
			if (newMaxValue != null)
				msgs = ((InternalEObject)newMaxValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__MAX_VALUE, null, msgs);
			msgs = basicSetMaxValue(newMaxValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__MAX_VALUE, newMaxValue, newMaxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealPropertyType getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValue(RealPropertyType newMinValue, NotificationChain msgs) {
		RealPropertyType oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__MIN_VALUE, oldMinValue, newMinValue);
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
	public void setMinValue(RealPropertyType newMinValue) {
		if (newMinValue != minValue) {
			NotificationChain msgs = null;
			if (minValue != null)
				msgs = ((InternalEObject)minValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__MIN_VALUE, null, msgs);
			if (newMinValue != null)
				msgs = ((InternalEObject)newMinValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__MIN_VALUE, null, msgs);
			msgs = basicSetMinValue(newMinValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__MIN_VALUE, newMinValue, newMinValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomLengthPropertyType getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnits(UomLengthPropertyType newUnits, NotificationChain msgs) {
		UomLengthPropertyType oldUnits = units;
		units = newUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__UNITS, oldUnits, newUnits);
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
	public void setUnits(UomLengthPropertyType newUnits) {
		if (newUnits != units) {
			NotificationChain msgs = null;
			if (units != null)
				msgs = ((InternalEObject)units).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__UNITS, null, msgs);
			if (newUnits != null)
				msgs = ((InternalEObject)newUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__UNITS, null, msgs);
			msgs = basicSetUnits(newUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__UNITS, newUnits, newUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealPropertyType getPeakResponse() {
		return peakResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeakResponse(RealPropertyType newPeakResponse, NotificationChain msgs) {
		RealPropertyType oldPeakResponse = peakResponse;
		peakResponse = newPeakResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__PEAK_RESPONSE, oldPeakResponse, newPeakResponse);
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
	public void setPeakResponse(RealPropertyType newPeakResponse) {
		if (newPeakResponse != peakResponse) {
			NotificationChain msgs = null;
			if (peakResponse != null)
				msgs = ((InternalEObject)peakResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__PEAK_RESPONSE, null, msgs);
			if (newPeakResponse != null)
				msgs = ((InternalEObject)newPeakResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__PEAK_RESPONSE, null, msgs);
			msgs = basicSetPeakResponse(newPeakResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__PEAK_RESPONSE, newPeakResponse, newPeakResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerPropertyType getBitsPerValue() {
		return bitsPerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBitsPerValue(IntegerPropertyType newBitsPerValue, NotificationChain msgs) {
		IntegerPropertyType oldBitsPerValue = bitsPerValue;
		bitsPerValue = newBitsPerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__BITS_PER_VALUE, oldBitsPerValue, newBitsPerValue);
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
	public void setBitsPerValue(IntegerPropertyType newBitsPerValue) {
		if (newBitsPerValue != bitsPerValue) {
			NotificationChain msgs = null;
			if (bitsPerValue != null)
				msgs = ((InternalEObject)bitsPerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__BITS_PER_VALUE, null, msgs);
			if (newBitsPerValue != null)
				msgs = ((InternalEObject)newBitsPerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__BITS_PER_VALUE, null, msgs);
			msgs = basicSetBitsPerValue(newBitsPerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__BITS_PER_VALUE, newBitsPerValue, newBitsPerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerPropertyType getToneGradation() {
		return toneGradation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToneGradation(IntegerPropertyType newToneGradation, NotificationChain msgs) {
		IntegerPropertyType oldToneGradation = toneGradation;
		toneGradation = newToneGradation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__TONE_GRADATION, oldToneGradation, newToneGradation);
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
	public void setToneGradation(IntegerPropertyType newToneGradation) {
		if (newToneGradation != toneGradation) {
			NotificationChain msgs = null;
			if (toneGradation != null)
				msgs = ((InternalEObject)toneGradation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__TONE_GRADATION, null, msgs);
			if (newToneGradation != null)
				msgs = ((InternalEObject)newToneGradation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__TONE_GRADATION, null, msgs);
			msgs = basicSetToneGradation(newToneGradation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__TONE_GRADATION, newToneGradation, newToneGradation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealPropertyType getScaleFactor() {
		return scaleFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaleFactor(RealPropertyType newScaleFactor, NotificationChain msgs) {
		RealPropertyType oldScaleFactor = scaleFactor;
		scaleFactor = newScaleFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__SCALE_FACTOR, oldScaleFactor, newScaleFactor);
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
	public void setScaleFactor(RealPropertyType newScaleFactor) {
		if (newScaleFactor != scaleFactor) {
			NotificationChain msgs = null;
			if (scaleFactor != null)
				msgs = ((InternalEObject)scaleFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__SCALE_FACTOR, null, msgs);
			if (newScaleFactor != null)
				msgs = ((InternalEObject)newScaleFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__SCALE_FACTOR, null, msgs);
			msgs = basicSetScaleFactor(newScaleFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__SCALE_FACTOR, newScaleFactor, newScaleFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealPropertyType getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(RealPropertyType newOffset, NotificationChain msgs) {
		RealPropertyType oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__OFFSET, oldOffset, newOffset);
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
	public void setOffset(RealPropertyType newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BAND_TYPE__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BAND_TYPE__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_BAND_TYPE__MAX_VALUE:
				return basicSetMaxValue(null, msgs);
			case GMDPackage.MD_BAND_TYPE__MIN_VALUE:
				return basicSetMinValue(null, msgs);
			case GMDPackage.MD_BAND_TYPE__UNITS:
				return basicSetUnits(null, msgs);
			case GMDPackage.MD_BAND_TYPE__PEAK_RESPONSE:
				return basicSetPeakResponse(null, msgs);
			case GMDPackage.MD_BAND_TYPE__BITS_PER_VALUE:
				return basicSetBitsPerValue(null, msgs);
			case GMDPackage.MD_BAND_TYPE__TONE_GRADATION:
				return basicSetToneGradation(null, msgs);
			case GMDPackage.MD_BAND_TYPE__SCALE_FACTOR:
				return basicSetScaleFactor(null, msgs);
			case GMDPackage.MD_BAND_TYPE__OFFSET:
				return basicSetOffset(null, msgs);
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
			case GMDPackage.MD_BAND_TYPE__MAX_VALUE:
				return getMaxValue();
			case GMDPackage.MD_BAND_TYPE__MIN_VALUE:
				return getMinValue();
			case GMDPackage.MD_BAND_TYPE__UNITS:
				return getUnits();
			case GMDPackage.MD_BAND_TYPE__PEAK_RESPONSE:
				return getPeakResponse();
			case GMDPackage.MD_BAND_TYPE__BITS_PER_VALUE:
				return getBitsPerValue();
			case GMDPackage.MD_BAND_TYPE__TONE_GRADATION:
				return getToneGradation();
			case GMDPackage.MD_BAND_TYPE__SCALE_FACTOR:
				return getScaleFactor();
			case GMDPackage.MD_BAND_TYPE__OFFSET:
				return getOffset();
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
			case GMDPackage.MD_BAND_TYPE__MAX_VALUE:
				setMaxValue((RealPropertyType)newValue);
				return;
			case GMDPackage.MD_BAND_TYPE__MIN_VALUE:
				setMinValue((RealPropertyType)newValue);
				return;
			case GMDPackage.MD_BAND_TYPE__UNITS:
				setUnits((UomLengthPropertyType)newValue);
				return;
			case GMDPackage.MD_BAND_TYPE__PEAK_RESPONSE:
				setPeakResponse((RealPropertyType)newValue);
				return;
			case GMDPackage.MD_BAND_TYPE__BITS_PER_VALUE:
				setBitsPerValue((IntegerPropertyType)newValue);
				return;
			case GMDPackage.MD_BAND_TYPE__TONE_GRADATION:
				setToneGradation((IntegerPropertyType)newValue);
				return;
			case GMDPackage.MD_BAND_TYPE__SCALE_FACTOR:
				setScaleFactor((RealPropertyType)newValue);
				return;
			case GMDPackage.MD_BAND_TYPE__OFFSET:
				setOffset((RealPropertyType)newValue);
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
			case GMDPackage.MD_BAND_TYPE__MAX_VALUE:
				setMaxValue((RealPropertyType)null);
				return;
			case GMDPackage.MD_BAND_TYPE__MIN_VALUE:
				setMinValue((RealPropertyType)null);
				return;
			case GMDPackage.MD_BAND_TYPE__UNITS:
				setUnits((UomLengthPropertyType)null);
				return;
			case GMDPackage.MD_BAND_TYPE__PEAK_RESPONSE:
				setPeakResponse((RealPropertyType)null);
				return;
			case GMDPackage.MD_BAND_TYPE__BITS_PER_VALUE:
				setBitsPerValue((IntegerPropertyType)null);
				return;
			case GMDPackage.MD_BAND_TYPE__TONE_GRADATION:
				setToneGradation((IntegerPropertyType)null);
				return;
			case GMDPackage.MD_BAND_TYPE__SCALE_FACTOR:
				setScaleFactor((RealPropertyType)null);
				return;
			case GMDPackage.MD_BAND_TYPE__OFFSET:
				setOffset((RealPropertyType)null);
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
			case GMDPackage.MD_BAND_TYPE__MAX_VALUE:
				return maxValue != null;
			case GMDPackage.MD_BAND_TYPE__MIN_VALUE:
				return minValue != null;
			case GMDPackage.MD_BAND_TYPE__UNITS:
				return units != null;
			case GMDPackage.MD_BAND_TYPE__PEAK_RESPONSE:
				return peakResponse != null;
			case GMDPackage.MD_BAND_TYPE__BITS_PER_VALUE:
				return bitsPerValue != null;
			case GMDPackage.MD_BAND_TYPE__TONE_GRADATION:
				return toneGradation != null;
			case GMDPackage.MD_BAND_TYPE__SCALE_FACTOR:
				return scaleFactor != null;
			case GMDPackage.MD_BAND_TYPE__OFFSET:
				return offset != null;
		}
		return super.eIsSet(featureID);
	}

} //MDBandTypeImpl
