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
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Code;
import org.hl7.fhir.DataRequirementValueFilter;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Requirement Value Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementValueFilterImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementValueFilterImpl#getSearchParam <em>Search Param</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementValueFilterImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementValueFilterImpl#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementValueFilterImpl#getValuePeriod <em>Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementValueFilterImpl#getValueDuration <em>Value Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRequirementValueFilterImpl extends DataTypeImpl implements DataRequirementValueFilter {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String path;

	/**
	 * The cached value of the '{@link #getSearchParam() <em>Search Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParam()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String searchParam;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected Code comparator;

	/**
	 * The cached value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime valueDateTime;

	/**
	 * The cached value of the '{@link #getValuePeriod() <em>Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period valuePeriod;

	/**
	 * The cached value of the '{@link #getValueDuration() <em>Value Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration valueDuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementValueFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getDataRequirementValueFilter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(org.hl7.fhir.String newPath, NotificationChain msgs) {
		org.hl7.fhir.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__PATH, oldPath, newPath);
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
	public void setPath(org.hl7.fhir.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSearchParam() {
		return searchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchParam(org.hl7.fhir.String newSearchParam, NotificationChain msgs) {
		org.hl7.fhir.String oldSearchParam = searchParam;
		searchParam = newSearchParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__SEARCH_PARAM, oldSearchParam, newSearchParam);
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
	public void setSearchParam(org.hl7.fhir.String newSearchParam) {
		if (newSearchParam != searchParam) {
			NotificationChain msgs = null;
			if (searchParam != null)
				msgs = ((InternalEObject)searchParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__SEARCH_PARAM, null, msgs);
			if (newSearchParam != null)
				msgs = ((InternalEObject)newSearchParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__SEARCH_PARAM, null, msgs);
			msgs = basicSetSearchParam(newSearchParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__SEARCH_PARAM, newSearchParam, newSearchParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getComparator() {
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparator(Code newComparator, NotificationChain msgs) {
		Code oldComparator = comparator;
		comparator = newComparator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__COMPARATOR, oldComparator, newComparator);
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
	public void setComparator(Code newComparator) {
		if (newComparator != comparator) {
			NotificationChain msgs = null;
			if (comparator != null)
				msgs = ((InternalEObject)comparator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__COMPARATOR, null, msgs);
			if (newComparator != null)
				msgs = ((InternalEObject)newComparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__COMPARATOR, null, msgs);
			msgs = basicSetComparator(newComparator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__COMPARATOR, newComparator, newComparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getValueDateTime() {
		return valueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDateTime(DateTime newValueDateTime, NotificationChain msgs) {
		DateTime oldValueDateTime = valueDateTime;
		valueDateTime = newValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DATE_TIME, oldValueDateTime, newValueDateTime);
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
	public void setValueDateTime(DateTime newValueDateTime) {
		if (newValueDateTime != valueDateTime) {
			NotificationChain msgs = null;
			if (valueDateTime != null)
				msgs = ((InternalEObject)valueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DATE_TIME, null, msgs);
			if (newValueDateTime != null)
				msgs = ((InternalEObject)newValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DATE_TIME, null, msgs);
			msgs = basicSetValueDateTime(newValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DATE_TIME, newValueDateTime, newValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getValuePeriod() {
		return valuePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuePeriod(Period newValuePeriod, NotificationChain msgs) {
		Period oldValuePeriod = valuePeriod;
		valuePeriod = newValuePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_PERIOD, oldValuePeriod, newValuePeriod);
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
	public void setValuePeriod(Period newValuePeriod) {
		if (newValuePeriod != valuePeriod) {
			NotificationChain msgs = null;
			if (valuePeriod != null)
				msgs = ((InternalEObject)valuePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_PERIOD, null, msgs);
			if (newValuePeriod != null)
				msgs = ((InternalEObject)newValuePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_PERIOD, null, msgs);
			msgs = basicSetValuePeriod(newValuePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_PERIOD, newValuePeriod, newValuePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getValueDuration() {
		return valueDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDuration(Duration newValueDuration, NotificationChain msgs) {
		Duration oldValueDuration = valueDuration;
		valueDuration = newValueDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DURATION, oldValueDuration, newValueDuration);
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
	public void setValueDuration(Duration newValueDuration) {
		if (newValueDuration != valueDuration) {
			NotificationChain msgs = null;
			if (valueDuration != null)
				msgs = ((InternalEObject)valueDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DURATION, null, msgs);
			if (newValueDuration != null)
				msgs = ((InternalEObject)newValueDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DURATION, null, msgs);
			msgs = basicSetValueDuration(newValueDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DURATION, newValueDuration, newValueDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__PATH:
				return basicSetPath(null, msgs);
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__SEARCH_PARAM:
				return basicSetSearchParam(null, msgs);
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__COMPARATOR:
				return basicSetComparator(null, msgs);
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DATE_TIME:
				return basicSetValueDateTime(null, msgs);
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_PERIOD:
				return basicSetValuePeriod(null, msgs);
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DURATION:
				return basicSetValueDuration(null, msgs);
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
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__PATH:
				return getPath();
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__SEARCH_PARAM:
				return getSearchParam();
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__COMPARATOR:
				return getComparator();
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DATE_TIME:
				return getValueDateTime();
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_PERIOD:
				return getValuePeriod();
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DURATION:
				return getValueDuration();
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
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__PATH:
				setPath((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__SEARCH_PARAM:
				setSearchParam((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__COMPARATOR:
				setComparator((Code)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DATE_TIME:
				setValueDateTime((DateTime)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_PERIOD:
				setValuePeriod((Period)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DURATION:
				setValueDuration((Duration)newValue);
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
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__PATH:
				setPath((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__SEARCH_PARAM:
				setSearchParam((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__COMPARATOR:
				setComparator((Code)null);
				return;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DATE_TIME:
				setValueDateTime((DateTime)null);
				return;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_PERIOD:
				setValuePeriod((Period)null);
				return;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DURATION:
				setValueDuration((Duration)null);
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
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__PATH:
				return path != null;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__SEARCH_PARAM:
				return searchParam != null;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__COMPARATOR:
				return comparator != null;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DATE_TIME:
				return valueDateTime != null;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_PERIOD:
				return valuePeriod != null;
			case FHIRPackage.DATA_REQUIREMENT_VALUE_FILTER__VALUE_DURATION:
				return valueDuration != null;
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementValueFilterImpl
