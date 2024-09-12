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
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.FHIRTypes;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationDefinitionReferencedFrom;
import org.hl7.fhir.OperationParameterScope;
import org.hl7.fhir.OperationParameterUse;
import org.hl7.fhir.SearchParamType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Definition Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getAllowedType <em>Allowed Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getTargetProfile <em>Target Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getSearchType <em>Search Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getReferencedFrom <em>Referenced From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionParameterImpl#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationDefinitionParameterImpl extends BackboneElementImpl implements OperationDefinitionParameter {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Code name;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected OperationParameterUse use;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationParameterScope> scope;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String max;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Markdown documentation;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FHIRTypes type;

	/**
	 * The cached value of the '{@link #getAllowedType() <em>Allowed Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedType()
	 * @generated
	 * @ordered
	 */
	protected EList<FHIRTypes> allowedType;

	/**
	 * The cached value of the '{@link #getTargetProfile() <em>Target Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> targetProfile;

	/**
	 * The cached value of the '{@link #getSearchType() <em>Search Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchType()
	 * @generated
	 * @ordered
	 */
	protected SearchParamType searchType;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected OperationDefinitionBinding binding;

	/**
	 * The cached value of the '{@link #getReferencedFrom() <em>Referenced From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationDefinitionReferencedFrom> referencedFrom;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationDefinitionParameter> part;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefinitionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getOperationDefinitionParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Code newName, NotificationChain msgs) {
		Code oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__NAME, oldName, newName);
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
	public void setName(Code newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterUse getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(OperationParameterUse newUse, NotificationChain msgs) {
		OperationParameterUse oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__USE, oldUse, newUse);
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
	public void setUse(OperationParameterUse newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__USE, newUse, newUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationParameterScope> getScope() {
		if (scope == null) {
			scope = new EObjectContainmentEList<OperationParameterScope>(OperationParameterScope.class, this, FHIRPackage.OPERATION_DEFINITION_PARAMETER__SCOPE);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(org.hl7.fhir.Integer newMin, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__MIN, oldMin, newMin);
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
	public void setMin(org.hl7.fhir.Integer newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(org.hl7.fhir.String newMax, NotificationChain msgs) {
		org.hl7.fhir.String oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__MAX, oldMax, newMax);
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
	public void setMax(org.hl7.fhir.String newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Markdown newDocumentation, NotificationChain msgs) {
		Markdown oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION, oldDocumentation, newDocumentation);
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
	public void setDocumentation(Markdown newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FHIRTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(FHIRTypes newType, NotificationChain msgs) {
		FHIRTypes oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__TYPE, oldType, newType);
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
	public void setType(FHIRTypes newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FHIRTypes> getAllowedType() {
		if (allowedType == null) {
			allowedType = new EObjectContainmentEList<FHIRTypes>(FHIRTypes.class, this, FHIRPackage.OPERATION_DEFINITION_PARAMETER__ALLOWED_TYPE);
		}
		return allowedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getTargetProfile() {
		if (targetProfile == null) {
			targetProfile = new EObjectContainmentEList<Canonical>(Canonical.class, this, FHIRPackage.OPERATION_DEFINITION_PARAMETER__TARGET_PROFILE);
		}
		return targetProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchParamType getSearchType() {
		return searchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchType(SearchParamType newSearchType, NotificationChain msgs) {
		SearchParamType oldSearchType = searchType;
		searchType = newSearchType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE, oldSearchType, newSearchType);
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
	public void setSearchType(SearchParamType newSearchType) {
		if (newSearchType != searchType) {
			NotificationChain msgs = null;
			if (searchType != null)
				msgs = ((InternalEObject)searchType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE, null, msgs);
			if (newSearchType != null)
				msgs = ((InternalEObject)newSearchType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE, null, msgs);
			msgs = basicSetSearchType(newSearchType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE, newSearchType, newSearchType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationDefinitionBinding getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(OperationDefinitionBinding newBinding, NotificationChain msgs) {
		OperationDefinitionBinding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__BINDING, oldBinding, newBinding);
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
	public void setBinding(OperationDefinitionBinding newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject)binding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__BINDING, null, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject)newBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OPERATION_DEFINITION_PARAMETER__BINDING, null, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OPERATION_DEFINITION_PARAMETER__BINDING, newBinding, newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationDefinitionReferencedFrom> getReferencedFrom() {
		if (referencedFrom == null) {
			referencedFrom = new EObjectContainmentEList<OperationDefinitionReferencedFrom>(OperationDefinitionReferencedFrom.class, this, FHIRPackage.OPERATION_DEFINITION_PARAMETER__REFERENCED_FROM);
		}
		return referencedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationDefinitionParameter> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<OperationDefinitionParameter>(OperationDefinitionParameter.class, this, FHIRPackage.OPERATION_DEFINITION_PARAMETER__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__NAME:
				return basicSetName(null, msgs);
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__USE:
				return basicSetUse(null, msgs);
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__SCOPE:
				return ((InternalEList<?>)getScope()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__MIN:
				return basicSetMin(null, msgs);
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__MAX:
				return basicSetMax(null, msgs);
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__ALLOWED_TYPE:
				return ((InternalEList<?>)getAllowedType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__TARGET_PROFILE:
				return ((InternalEList<?>)getTargetProfile()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE:
				return basicSetSearchType(null, msgs);
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__BINDING:
				return basicSetBinding(null, msgs);
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__REFERENCED_FROM:
				return ((InternalEList<?>)getReferencedFrom()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__NAME:
				return getName();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__USE:
				return getUse();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__SCOPE:
				return getScope();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__MIN:
				return getMin();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__MAX:
				return getMax();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION:
				return getDocumentation();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__TYPE:
				return getType();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__ALLOWED_TYPE:
				return getAllowedType();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__TARGET_PROFILE:
				return getTargetProfile();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE:
				return getSearchType();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__BINDING:
				return getBinding();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__REFERENCED_FROM:
				return getReferencedFrom();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__PART:
				return getPart();
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
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__NAME:
				setName((Code)newValue);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__USE:
				setUse((OperationParameterUse)newValue);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends OperationParameterScope>)newValue);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__MIN:
				setMin((org.hl7.fhir.Integer)newValue);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__MAX:
				setMax((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION:
				setDocumentation((Markdown)newValue);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__TYPE:
				setType((FHIRTypes)newValue);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__ALLOWED_TYPE:
				getAllowedType().clear();
				getAllowedType().addAll((Collection<? extends FHIRTypes>)newValue);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__TARGET_PROFILE:
				getTargetProfile().clear();
				getTargetProfile().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE:
				setSearchType((SearchParamType)newValue);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__BINDING:
				setBinding((OperationDefinitionBinding)newValue);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__REFERENCED_FROM:
				getReferencedFrom().clear();
				getReferencedFrom().addAll((Collection<? extends OperationDefinitionReferencedFrom>)newValue);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends OperationDefinitionParameter>)newValue);
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
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__NAME:
				setName((Code)null);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__USE:
				setUse((OperationParameterUse)null);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__SCOPE:
				getScope().clear();
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__MIN:
				setMin((org.hl7.fhir.Integer)null);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__MAX:
				setMax((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION:
				setDocumentation((Markdown)null);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__TYPE:
				setType((FHIRTypes)null);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__ALLOWED_TYPE:
				getAllowedType().clear();
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__TARGET_PROFILE:
				getTargetProfile().clear();
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE:
				setSearchType((SearchParamType)null);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__BINDING:
				setBinding((OperationDefinitionBinding)null);
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__REFERENCED_FROM:
				getReferencedFrom().clear();
				return;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__PART:
				getPart().clear();
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
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__NAME:
				return name != null;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__USE:
				return use != null;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__SCOPE:
				return scope != null && !scope.isEmpty();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__MIN:
				return min != null;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__MAX:
				return max != null;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION:
				return documentation != null;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__TYPE:
				return type != null;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__ALLOWED_TYPE:
				return allowedType != null && !allowedType.isEmpty();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__TARGET_PROFILE:
				return targetProfile != null && !targetProfile.isEmpty();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE:
				return searchType != null;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__BINDING:
				return binding != null;
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__REFERENCED_FROM:
				return referencedFrom != null && !referencedFrom.isEmpty();
			case FHIRPackage.OPERATION_DEFINITION_PARAMETER__PART:
				return part != null && !part.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationDefinitionParameterImpl
