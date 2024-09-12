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
package net.opengis.wfs.impl;

import java.math.BigInteger;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.wfs.AdditionalValuesType;
import net.opengis.wfs.MemberPropertyType;
import net.opengis.wfs.TruncatedResponseType;
import net.opengis.wfs.ValueCollectionType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.ValueCollectionTypeImpl#getMember <em>Member</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.ValueCollectionTypeImpl#getAdditionalValues <em>Additional Values</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.ValueCollectionTypeImpl#getTruncatedResponse <em>Truncated Response</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.ValueCollectionTypeImpl#getNext <em>Next</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.ValueCollectionTypeImpl#getNumberMatched <em>Number Matched</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.ValueCollectionTypeImpl#getNumberReturned <em>Number Returned</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.ValueCollectionTypeImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.ValueCollectionTypeImpl#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueCollectionTypeImpl extends MinimalEObjectImpl.Container implements ValueCollectionType {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberPropertyType> member;

	/**
	 * The cached value of the '{@link #getAdditionalValues() <em>Additional Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalValues()
	 * @generated
	 * @ordered
	 */
	protected AdditionalValuesType additionalValues;

	/**
	 * The cached value of the '{@link #getTruncatedResponse() <em>Truncated Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruncatedResponse()
	 * @generated
	 * @ordered
	 */
	protected TruncatedResponseType truncatedResponse;

	/**
	 * The default value of the '{@link #getNext() <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected String next = NEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberMatched() <em>Number Matched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberMatched()
	 * @generated
	 * @ordered
	 */
	protected static final Object NUMBER_MATCHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberMatched() <em>Number Matched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberMatched()
	 * @generated
	 * @ordered
	 */
	protected Object numberMatched = NUMBER_MATCHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberReturned() <em>Number Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberReturned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_RETURNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberReturned() <em>Number Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberReturned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberReturned = NUMBER_RETURNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrevious() <em>Previous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected String previous = PREVIOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.VALUE_COLLECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MemberPropertyType> getMember() {
		if (member == null) {
			member = new EObjectContainmentEList<MemberPropertyType>(MemberPropertyType.class, this, WFSPackage.VALUE_COLLECTION_TYPE__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalValuesType getAdditionalValues() {
		return additionalValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalValues(AdditionalValuesType newAdditionalValues, NotificationChain msgs) {
		AdditionalValuesType oldAdditionalValues = additionalValues;
		additionalValues = newAdditionalValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFSPackage.VALUE_COLLECTION_TYPE__ADDITIONAL_VALUES, oldAdditionalValues, newAdditionalValues);
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
	public void setAdditionalValues(AdditionalValuesType newAdditionalValues) {
		if (newAdditionalValues != additionalValues) {
			NotificationChain msgs = null;
			if (additionalValues != null)
				msgs = ((InternalEObject)additionalValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WFSPackage.VALUE_COLLECTION_TYPE__ADDITIONAL_VALUES, null, msgs);
			if (newAdditionalValues != null)
				msgs = ((InternalEObject)newAdditionalValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WFSPackage.VALUE_COLLECTION_TYPE__ADDITIONAL_VALUES, null, msgs);
			msgs = basicSetAdditionalValues(newAdditionalValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.VALUE_COLLECTION_TYPE__ADDITIONAL_VALUES, newAdditionalValues, newAdditionalValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TruncatedResponseType getTruncatedResponse() {
		return truncatedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTruncatedResponse(TruncatedResponseType newTruncatedResponse, NotificationChain msgs) {
		TruncatedResponseType oldTruncatedResponse = truncatedResponse;
		truncatedResponse = newTruncatedResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFSPackage.VALUE_COLLECTION_TYPE__TRUNCATED_RESPONSE, oldTruncatedResponse, newTruncatedResponse);
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
	public void setTruncatedResponse(TruncatedResponseType newTruncatedResponse) {
		if (newTruncatedResponse != truncatedResponse) {
			NotificationChain msgs = null;
			if (truncatedResponse != null)
				msgs = ((InternalEObject)truncatedResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WFSPackage.VALUE_COLLECTION_TYPE__TRUNCATED_RESPONSE, null, msgs);
			if (newTruncatedResponse != null)
				msgs = ((InternalEObject)newTruncatedResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WFSPackage.VALUE_COLLECTION_TYPE__TRUNCATED_RESPONSE, null, msgs);
			msgs = basicSetTruncatedResponse(newTruncatedResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.VALUE_COLLECTION_TYPE__TRUNCATED_RESPONSE, newTruncatedResponse, newTruncatedResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNext(String newNext) {
		String oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.VALUE_COLLECTION_TYPE__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNumberMatched() {
		return numberMatched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberMatched(Object newNumberMatched) {
		Object oldNumberMatched = numberMatched;
		numberMatched = newNumberMatched;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.VALUE_COLLECTION_TYPE__NUMBER_MATCHED, oldNumberMatched, numberMatched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNumberReturned() {
		return numberReturned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberReturned(BigInteger newNumberReturned) {
		BigInteger oldNumberReturned = numberReturned;
		numberReturned = newNumberReturned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.VALUE_COLLECTION_TYPE__NUMBER_RETURNED, oldNumberReturned, numberReturned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrevious(String newPrevious) {
		String oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.VALUE_COLLECTION_TYPE__PREVIOUS, oldPrevious, previous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStamp(XMLGregorianCalendar newTimeStamp) {
		XMLGregorianCalendar oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.VALUE_COLLECTION_TYPE__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.VALUE_COLLECTION_TYPE__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case WFSPackage.VALUE_COLLECTION_TYPE__ADDITIONAL_VALUES:
				return basicSetAdditionalValues(null, msgs);
			case WFSPackage.VALUE_COLLECTION_TYPE__TRUNCATED_RESPONSE:
				return basicSetTruncatedResponse(null, msgs);
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
			case WFSPackage.VALUE_COLLECTION_TYPE__MEMBER:
				return getMember();
			case WFSPackage.VALUE_COLLECTION_TYPE__ADDITIONAL_VALUES:
				return getAdditionalValues();
			case WFSPackage.VALUE_COLLECTION_TYPE__TRUNCATED_RESPONSE:
				return getTruncatedResponse();
			case WFSPackage.VALUE_COLLECTION_TYPE__NEXT:
				return getNext();
			case WFSPackage.VALUE_COLLECTION_TYPE__NUMBER_MATCHED:
				return getNumberMatched();
			case WFSPackage.VALUE_COLLECTION_TYPE__NUMBER_RETURNED:
				return getNumberReturned();
			case WFSPackage.VALUE_COLLECTION_TYPE__PREVIOUS:
				return getPrevious();
			case WFSPackage.VALUE_COLLECTION_TYPE__TIME_STAMP:
				return getTimeStamp();
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
			case WFSPackage.VALUE_COLLECTION_TYPE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends MemberPropertyType>)newValue);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__ADDITIONAL_VALUES:
				setAdditionalValues((AdditionalValuesType)newValue);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__TRUNCATED_RESPONSE:
				setTruncatedResponse((TruncatedResponseType)newValue);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__NEXT:
				setNext((String)newValue);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__NUMBER_MATCHED:
				setNumberMatched(newValue);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__NUMBER_RETURNED:
				setNumberReturned((BigInteger)newValue);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__PREVIOUS:
				setPrevious((String)newValue);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__TIME_STAMP:
				setTimeStamp((XMLGregorianCalendar)newValue);
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
			case WFSPackage.VALUE_COLLECTION_TYPE__MEMBER:
				getMember().clear();
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__ADDITIONAL_VALUES:
				setAdditionalValues((AdditionalValuesType)null);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__TRUNCATED_RESPONSE:
				setTruncatedResponse((TruncatedResponseType)null);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__NEXT:
				setNext(NEXT_EDEFAULT);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__NUMBER_MATCHED:
				setNumberMatched(NUMBER_MATCHED_EDEFAULT);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__NUMBER_RETURNED:
				setNumberReturned(NUMBER_RETURNED_EDEFAULT);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__PREVIOUS:
				setPrevious(PREVIOUS_EDEFAULT);
				return;
			case WFSPackage.VALUE_COLLECTION_TYPE__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
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
			case WFSPackage.VALUE_COLLECTION_TYPE__MEMBER:
				return member != null && !member.isEmpty();
			case WFSPackage.VALUE_COLLECTION_TYPE__ADDITIONAL_VALUES:
				return additionalValues != null;
			case WFSPackage.VALUE_COLLECTION_TYPE__TRUNCATED_RESPONSE:
				return truncatedResponse != null;
			case WFSPackage.VALUE_COLLECTION_TYPE__NEXT:
				return NEXT_EDEFAULT == null ? next != null : !NEXT_EDEFAULT.equals(next);
			case WFSPackage.VALUE_COLLECTION_TYPE__NUMBER_MATCHED:
				return NUMBER_MATCHED_EDEFAULT == null ? numberMatched != null : !NUMBER_MATCHED_EDEFAULT.equals(numberMatched);
			case WFSPackage.VALUE_COLLECTION_TYPE__NUMBER_RETURNED:
				return NUMBER_RETURNED_EDEFAULT == null ? numberReturned != null : !NUMBER_RETURNED_EDEFAULT.equals(numberReturned);
			case WFSPackage.VALUE_COLLECTION_TYPE__PREVIOUS:
				return PREVIOUS_EDEFAULT == null ? previous != null : !PREVIOUS_EDEFAULT.equals(previous);
			case WFSPackage.VALUE_COLLECTION_TYPE__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
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
		result.append(" (next: ");
		result.append(next);
		result.append(", numberMatched: ");
		result.append(numberMatched);
		result.append(", numberReturned: ");
		result.append(numberReturned);
		result.append(", previous: ");
		result.append(previous);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

} //ValueCollectionTypeImpl
