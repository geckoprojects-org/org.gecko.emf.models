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

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.StringOrRefType;
import net.opengis.gml.gml.TimeCalendarEraType;
import net.opengis.gml.gml.TimePeriodPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Calendar Era Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.TimeCalendarEraTypeImpl#getReferenceEvent <em>Reference Event</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TimeCalendarEraTypeImpl#getReferenceDate <em>Reference Date</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TimeCalendarEraTypeImpl#getJulianReference <em>Julian Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TimeCalendarEraTypeImpl#getEpochOfUse <em>Epoch Of Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeCalendarEraTypeImpl extends DefinitionTypeImpl implements TimeCalendarEraType {
	/**
	 * The cached value of the '{@link #getReferenceEvent() <em>Reference Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceEvent()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType referenceEvent;

	/**
	 * The default value of the '{@link #getReferenceDate() <em>Reference Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar REFERENCE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceDate() <em>Reference Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar referenceDate = REFERENCE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJulianReference() <em>Julian Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJulianReference()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal JULIAN_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJulianReference() <em>Julian Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJulianReference()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal julianReference = JULIAN_REFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEpochOfUse() <em>Epoch Of Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpochOfUse()
	 * @generated
	 * @ordered
	 */
	protected TimePeriodPropertyType epochOfUse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeCalendarEraTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTimeCalendarEraType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getReferenceEvent() {
		return referenceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceEvent(StringOrRefType newReferenceEvent, NotificationChain msgs) {
		StringOrRefType oldReferenceEvent = referenceEvent;
		referenceEvent = newReferenceEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_EVENT, oldReferenceEvent, newReferenceEvent);
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
	public void setReferenceEvent(StringOrRefType newReferenceEvent) {
		if (newReferenceEvent != referenceEvent) {
			NotificationChain msgs = null;
			if (referenceEvent != null)
				msgs = ((InternalEObject)referenceEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_EVENT, null, msgs);
			if (newReferenceEvent != null)
				msgs = ((InternalEObject)newReferenceEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_EVENT, null, msgs);
			msgs = basicSetReferenceEvent(newReferenceEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_EVENT, newReferenceEvent, newReferenceEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getReferenceDate() {
		return referenceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceDate(XMLGregorianCalendar newReferenceDate) {
		XMLGregorianCalendar oldReferenceDate = referenceDate;
		referenceDate = newReferenceDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_DATE, oldReferenceDate, referenceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getJulianReference() {
		return julianReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJulianReference(BigDecimal newJulianReference) {
		BigDecimal oldJulianReference = julianReference;
		julianReference = newJulianReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_CALENDAR_ERA_TYPE__JULIAN_REFERENCE, oldJulianReference, julianReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePeriodPropertyType getEpochOfUse() {
		return epochOfUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpochOfUse(TimePeriodPropertyType newEpochOfUse, NotificationChain msgs) {
		TimePeriodPropertyType oldEpochOfUse = epochOfUse;
		epochOfUse = newEpochOfUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_CALENDAR_ERA_TYPE__EPOCH_OF_USE, oldEpochOfUse, newEpochOfUse);
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
	public void setEpochOfUse(TimePeriodPropertyType newEpochOfUse) {
		if (newEpochOfUse != epochOfUse) {
			NotificationChain msgs = null;
			if (epochOfUse != null)
				msgs = ((InternalEObject)epochOfUse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_CALENDAR_ERA_TYPE__EPOCH_OF_USE, null, msgs);
			if (newEpochOfUse != null)
				msgs = ((InternalEObject)newEpochOfUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_CALENDAR_ERA_TYPE__EPOCH_OF_USE, null, msgs);
			msgs = basicSetEpochOfUse(newEpochOfUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_CALENDAR_ERA_TYPE__EPOCH_OF_USE, newEpochOfUse, newEpochOfUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_EVENT:
				return basicSetReferenceEvent(null, msgs);
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__EPOCH_OF_USE:
				return basicSetEpochOfUse(null, msgs);
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
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_EVENT:
				return getReferenceEvent();
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_DATE:
				return getReferenceDate();
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__JULIAN_REFERENCE:
				return getJulianReference();
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__EPOCH_OF_USE:
				return getEpochOfUse();
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
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_EVENT:
				setReferenceEvent((StringOrRefType)newValue);
				return;
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_DATE:
				setReferenceDate((XMLGregorianCalendar)newValue);
				return;
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__JULIAN_REFERENCE:
				setJulianReference((BigDecimal)newValue);
				return;
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__EPOCH_OF_USE:
				setEpochOfUse((TimePeriodPropertyType)newValue);
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
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_EVENT:
				setReferenceEvent((StringOrRefType)null);
				return;
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_DATE:
				setReferenceDate(REFERENCE_DATE_EDEFAULT);
				return;
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__JULIAN_REFERENCE:
				setJulianReference(JULIAN_REFERENCE_EDEFAULT);
				return;
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__EPOCH_OF_USE:
				setEpochOfUse((TimePeriodPropertyType)null);
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
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_EVENT:
				return referenceEvent != null;
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__REFERENCE_DATE:
				return REFERENCE_DATE_EDEFAULT == null ? referenceDate != null : !REFERENCE_DATE_EDEFAULT.equals(referenceDate);
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__JULIAN_REFERENCE:
				return JULIAN_REFERENCE_EDEFAULT == null ? julianReference != null : !JULIAN_REFERENCE_EDEFAULT.equals(julianReference);
			case GMLPackage.TIME_CALENDAR_ERA_TYPE__EPOCH_OF_USE:
				return epochOfUse != null;
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
		result.append(" (referenceDate: ");
		result.append(referenceDate);
		result.append(", julianReference: ");
		result.append(julianReference);
		result.append(')');
		return result.toString();
	}

} //TimeCalendarEraTypeImpl
