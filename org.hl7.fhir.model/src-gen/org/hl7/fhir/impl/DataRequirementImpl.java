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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Canonical;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.DataRequirementDateFilter;
import org.hl7.fhir.DataRequirementSort;
import org.hl7.fhir.DataRequirementValueFilter;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getSubjectCodeableConcept <em>Subject Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getSubjectReference <em>Subject Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getCodeFilter <em>Code Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getDateFilter <em>Date Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getValueFilter <em>Value Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getSort <em>Sort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRequirementImpl extends DataTypeImpl implements DataRequirement {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> profile;

	/**
	 * The cached value of the '{@link #getSubjectCodeableConcept() <em>Subject Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subjectCodeableConcept;

	/**
	 * The cached value of the '{@link #getSubjectReference() <em>Subject Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectReference()
	 * @generated
	 * @ordered
	 */
	protected Reference subjectReference;

	/**
	 * The cached value of the '{@link #getMustSupport() <em>Must Support</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> mustSupport;

	/**
	 * The cached value of the '{@link #getCodeFilter() <em>Code Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirementCodeFilter> codeFilter;

	/**
	 * The cached value of the '{@link #getDateFilter() <em>Date Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirementDateFilter> dateFilter;

	/**
	 * The cached value of the '{@link #getValueFilter() <em>Value Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirementValueFilter> valueFilter;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt limit;

	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirementSort> sort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getDataRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT__TYPE, oldType, newType);
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
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getProfile() {
		if (profile == null) {
			profile = new EObjectContainmentEList<Canonical>(Canonical.class, this, FHIRPackage.DATA_REQUIREMENT__PROFILE);
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSubjectCodeableConcept() {
		return subjectCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectCodeableConcept(CodeableConcept newSubjectCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSubjectCodeableConcept = subjectCodeableConcept;
		subjectCodeableConcept = newSubjectCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT__SUBJECT_CODEABLE_CONCEPT, oldSubjectCodeableConcept, newSubjectCodeableConcept);
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
	public void setSubjectCodeableConcept(CodeableConcept newSubjectCodeableConcept) {
		if (newSubjectCodeableConcept != subjectCodeableConcept) {
			NotificationChain msgs = null;
			if (subjectCodeableConcept != null)
				msgs = ((InternalEObject)subjectCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT__SUBJECT_CODEABLE_CONCEPT, null, msgs);
			if (newSubjectCodeableConcept != null)
				msgs = ((InternalEObject)newSubjectCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT__SUBJECT_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSubjectCodeableConcept(newSubjectCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT__SUBJECT_CODEABLE_CONCEPT, newSubjectCodeableConcept, newSubjectCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubjectReference() {
		return subjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectReference(Reference newSubjectReference, NotificationChain msgs) {
		Reference oldSubjectReference = subjectReference;
		subjectReference = newSubjectReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT__SUBJECT_REFERENCE, oldSubjectReference, newSubjectReference);
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
	public void setSubjectReference(Reference newSubjectReference) {
		if (newSubjectReference != subjectReference) {
			NotificationChain msgs = null;
			if (subjectReference != null)
				msgs = ((InternalEObject)subjectReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT__SUBJECT_REFERENCE, null, msgs);
			if (newSubjectReference != null)
				msgs = ((InternalEObject)newSubjectReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT__SUBJECT_REFERENCE, null, msgs);
			msgs = basicSetSubjectReference(newSubjectReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT__SUBJECT_REFERENCE, newSubjectReference, newSubjectReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getMustSupport() {
		if (mustSupport == null) {
			mustSupport = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FHIRPackage.DATA_REQUIREMENT__MUST_SUPPORT);
		}
		return mustSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataRequirementCodeFilter> getCodeFilter() {
		if (codeFilter == null) {
			codeFilter = new EObjectContainmentEList<DataRequirementCodeFilter>(DataRequirementCodeFilter.class, this, FHIRPackage.DATA_REQUIREMENT__CODE_FILTER);
		}
		return codeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataRequirementDateFilter> getDateFilter() {
		if (dateFilter == null) {
			dateFilter = new EObjectContainmentEList<DataRequirementDateFilter>(DataRequirementDateFilter.class, this, FHIRPackage.DATA_REQUIREMENT__DATE_FILTER);
		}
		return dateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataRequirementValueFilter> getValueFilter() {
		if (valueFilter == null) {
			valueFilter = new EObjectContainmentEList<DataRequirementValueFilter>(DataRequirementValueFilter.class, this, FHIRPackage.DATA_REQUIREMENT__VALUE_FILTER);
		}
		return valueFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimit(PositiveInt newLimit, NotificationChain msgs) {
		PositiveInt oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT__LIMIT, oldLimit, newLimit);
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
	public void setLimit(PositiveInt newLimit) {
		if (newLimit != limit) {
			NotificationChain msgs = null;
			if (limit != null)
				msgs = ((InternalEObject)limit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT__LIMIT, null, msgs);
			if (newLimit != null)
				msgs = ((InternalEObject)newLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DATA_REQUIREMENT__LIMIT, null, msgs);
			msgs = basicSetLimit(newLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DATA_REQUIREMENT__LIMIT, newLimit, newLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataRequirementSort> getSort() {
		if (sort == null) {
			sort = new EObjectContainmentEList<DataRequirementSort>(DataRequirementSort.class, this, FHIRPackage.DATA_REQUIREMENT__SORT);
		}
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.DATA_REQUIREMENT__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.DATA_REQUIREMENT__PROFILE:
				return ((InternalEList<?>)getProfile()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DATA_REQUIREMENT__SUBJECT_CODEABLE_CONCEPT:
				return basicSetSubjectCodeableConcept(null, msgs);
			case FHIRPackage.DATA_REQUIREMENT__SUBJECT_REFERENCE:
				return basicSetSubjectReference(null, msgs);
			case FHIRPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				return ((InternalEList<?>)getMustSupport()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DATA_REQUIREMENT__CODE_FILTER:
				return ((InternalEList<?>)getCodeFilter()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DATA_REQUIREMENT__DATE_FILTER:
				return ((InternalEList<?>)getDateFilter()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DATA_REQUIREMENT__VALUE_FILTER:
				return ((InternalEList<?>)getValueFilter()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DATA_REQUIREMENT__LIMIT:
				return basicSetLimit(null, msgs);
			case FHIRPackage.DATA_REQUIREMENT__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.DATA_REQUIREMENT__TYPE:
				return getType();
			case FHIRPackage.DATA_REQUIREMENT__PROFILE:
				return getProfile();
			case FHIRPackage.DATA_REQUIREMENT__SUBJECT_CODEABLE_CONCEPT:
				return getSubjectCodeableConcept();
			case FHIRPackage.DATA_REQUIREMENT__SUBJECT_REFERENCE:
				return getSubjectReference();
			case FHIRPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				return getMustSupport();
			case FHIRPackage.DATA_REQUIREMENT__CODE_FILTER:
				return getCodeFilter();
			case FHIRPackage.DATA_REQUIREMENT__DATE_FILTER:
				return getDateFilter();
			case FHIRPackage.DATA_REQUIREMENT__VALUE_FILTER:
				return getValueFilter();
			case FHIRPackage.DATA_REQUIREMENT__LIMIT:
				return getLimit();
			case FHIRPackage.DATA_REQUIREMENT__SORT:
				return getSort();
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
			case FHIRPackage.DATA_REQUIREMENT__TYPE:
				setType((Code)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT__PROFILE:
				getProfile().clear();
				getProfile().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT__SUBJECT_CODEABLE_CONCEPT:
				setSubjectCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT__SUBJECT_REFERENCE:
				setSubjectReference((Reference)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				getMustSupport().clear();
				getMustSupport().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT__CODE_FILTER:
				getCodeFilter().clear();
				getCodeFilter().addAll((Collection<? extends DataRequirementCodeFilter>)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT__DATE_FILTER:
				getDateFilter().clear();
				getDateFilter().addAll((Collection<? extends DataRequirementDateFilter>)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT__VALUE_FILTER:
				getValueFilter().clear();
				getValueFilter().addAll((Collection<? extends DataRequirementValueFilter>)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT__LIMIT:
				setLimit((PositiveInt)newValue);
				return;
			case FHIRPackage.DATA_REQUIREMENT__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends DataRequirementSort>)newValue);
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
			case FHIRPackage.DATA_REQUIREMENT__TYPE:
				setType((Code)null);
				return;
			case FHIRPackage.DATA_REQUIREMENT__PROFILE:
				getProfile().clear();
				return;
			case FHIRPackage.DATA_REQUIREMENT__SUBJECT_CODEABLE_CONCEPT:
				setSubjectCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.DATA_REQUIREMENT__SUBJECT_REFERENCE:
				setSubjectReference((Reference)null);
				return;
			case FHIRPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				getMustSupport().clear();
				return;
			case FHIRPackage.DATA_REQUIREMENT__CODE_FILTER:
				getCodeFilter().clear();
				return;
			case FHIRPackage.DATA_REQUIREMENT__DATE_FILTER:
				getDateFilter().clear();
				return;
			case FHIRPackage.DATA_REQUIREMENT__VALUE_FILTER:
				getValueFilter().clear();
				return;
			case FHIRPackage.DATA_REQUIREMENT__LIMIT:
				setLimit((PositiveInt)null);
				return;
			case FHIRPackage.DATA_REQUIREMENT__SORT:
				getSort().clear();
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
			case FHIRPackage.DATA_REQUIREMENT__TYPE:
				return type != null;
			case FHIRPackage.DATA_REQUIREMENT__PROFILE:
				return profile != null && !profile.isEmpty();
			case FHIRPackage.DATA_REQUIREMENT__SUBJECT_CODEABLE_CONCEPT:
				return subjectCodeableConcept != null;
			case FHIRPackage.DATA_REQUIREMENT__SUBJECT_REFERENCE:
				return subjectReference != null;
			case FHIRPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				return mustSupport != null && !mustSupport.isEmpty();
			case FHIRPackage.DATA_REQUIREMENT__CODE_FILTER:
				return codeFilter != null && !codeFilter.isEmpty();
			case FHIRPackage.DATA_REQUIREMENT__DATE_FILTER:
				return dateFilter != null && !dateFilter.isEmpty();
			case FHIRPackage.DATA_REQUIREMENT__VALUE_FILTER:
				return valueFilter != null && !valueFilter.isEmpty();
			case FHIRPackage.DATA_REQUIREMENT__LIMIT:
				return limit != null;
			case FHIRPackage.DATA_REQUIREMENT__SORT:
				return sort != null && !sort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementImpl
