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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.EnvelopeWithTimePeriodType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.TimePositionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Envelope With Time Period Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.EnvelopeWithTimePeriodTypeImpl#getBeginPosition <em>Begin Position</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EnvelopeWithTimePeriodTypeImpl#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EnvelopeWithTimePeriodTypeImpl#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvelopeWithTimePeriodTypeImpl extends EnvelopeTypeImpl implements EnvelopeWithTimePeriodType {
	/**
	 * The cached value of the '{@link #getBeginPosition() <em>Begin Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginPosition()
	 * @generated
	 * @ordered
	 */
	protected TimePositionType beginPosition;

	/**
	 * The cached value of the '{@link #getEndPosition() <em>End Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected TimePositionType endPosition;

	/**
	 * The default value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAME_EDEFAULT = "#ISO-8601";

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected String frame = FRAME_EDEFAULT;

	/**
	 * This is true if the Frame attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvelopeWithTimePeriodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getEnvelopeWithTimePeriodType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePositionType getBeginPosition() {
		return beginPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeginPosition(TimePositionType newBeginPosition, NotificationChain msgs) {
		TimePositionType oldBeginPosition = beginPosition;
		beginPosition = newBeginPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__BEGIN_POSITION, oldBeginPosition, newBeginPosition);
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
	public void setBeginPosition(TimePositionType newBeginPosition) {
		if (newBeginPosition != beginPosition) {
			NotificationChain msgs = null;
			if (beginPosition != null)
				msgs = ((InternalEObject)beginPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__BEGIN_POSITION, null, msgs);
			if (newBeginPosition != null)
				msgs = ((InternalEObject)newBeginPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__BEGIN_POSITION, null, msgs);
			msgs = basicSetBeginPosition(newBeginPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__BEGIN_POSITION, newBeginPosition, newBeginPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePositionType getEndPosition() {
		return endPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndPosition(TimePositionType newEndPosition, NotificationChain msgs) {
		TimePositionType oldEndPosition = endPosition;
		endPosition = newEndPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__END_POSITION, oldEndPosition, newEndPosition);
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
	public void setEndPosition(TimePositionType newEndPosition) {
		if (newEndPosition != endPosition) {
			NotificationChain msgs = null;
			if (endPosition != null)
				msgs = ((InternalEObject)endPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__END_POSITION, null, msgs);
			if (newEndPosition != null)
				msgs = ((InternalEObject)newEndPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__END_POSITION, null, msgs);
			msgs = basicSetEndPosition(newEndPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__END_POSITION, newEndPosition, newEndPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrame(String newFrame) {
		String oldFrame = frame;
		frame = newFrame;
		boolean oldFrameESet = frameESet;
		frameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__FRAME, oldFrame, frame, !oldFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFrame() {
		String oldFrame = frame;
		boolean oldFrameESet = frameESet;
		frame = FRAME_EDEFAULT;
		frameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__FRAME, oldFrame, FRAME_EDEFAULT, oldFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFrame() {
		return frameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__BEGIN_POSITION:
				return basicSetBeginPosition(null, msgs);
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__END_POSITION:
				return basicSetEndPosition(null, msgs);
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
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__BEGIN_POSITION:
				return getBeginPosition();
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__END_POSITION:
				return getEndPosition();
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__FRAME:
				return getFrame();
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
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__BEGIN_POSITION:
				setBeginPosition((TimePositionType)newValue);
				return;
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__END_POSITION:
				setEndPosition((TimePositionType)newValue);
				return;
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__FRAME:
				setFrame((String)newValue);
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
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__BEGIN_POSITION:
				setBeginPosition((TimePositionType)null);
				return;
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__END_POSITION:
				setEndPosition((TimePositionType)null);
				return;
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__FRAME:
				unsetFrame();
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
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__BEGIN_POSITION:
				return beginPosition != null;
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__END_POSITION:
				return endPosition != null;
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE__FRAME:
				return isSetFrame();
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
		result.append(" (frame: ");
		if (frameESet) result.append(frame); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EnvelopeWithTimePeriodTypeImpl
