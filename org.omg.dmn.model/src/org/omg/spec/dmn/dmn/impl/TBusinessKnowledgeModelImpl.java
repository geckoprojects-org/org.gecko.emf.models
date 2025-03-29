/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.dmn.dmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TAuthorityRequirement;
import org.omg.spec.dmn.dmn.TBusinessKnowledgeModel;
import org.omg.spec.dmn.dmn.TFunctionDefinition;
import org.omg.spec.dmn.dmn.TKnowledgeRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TBusiness Knowledge Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TBusinessKnowledgeModelImpl#getEncapsulatedLogic <em>Encapsulated Logic</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TBusinessKnowledgeModelImpl#getKnowledgeRequirement <em>Knowledge Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TBusinessKnowledgeModelImpl#getAuthorityRequirement <em>Authority Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TBusinessKnowledgeModelImpl extends TInvocableImpl implements TBusinessKnowledgeModel {
	/**
	 * The cached value of the '{@link #getEncapsulatedLogic() <em>Encapsulated Logic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedLogic()
	 * @generated
	 * @ordered
	 */
	protected TFunctionDefinition encapsulatedLogic;

	/**
	 * The cached value of the '{@link #getKnowledgeRequirement() <em>Knowledge Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<TKnowledgeRequirement> knowledgeRequirement;

	/**
	 * The cached value of the '{@link #getAuthorityRequirement() <em>Authority Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<TAuthorityRequirement> authorityRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBusinessKnowledgeModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TBUSINESS_KNOWLEDGE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFunctionDefinition getEncapsulatedLogic() {
		return encapsulatedLogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncapsulatedLogic(TFunctionDefinition newEncapsulatedLogic, NotificationChain msgs) {
		TFunctionDefinition oldEncapsulatedLogic = encapsulatedLogic;
		encapsulatedLogic = newEncapsulatedLogic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__ENCAPSULATED_LOGIC, oldEncapsulatedLogic, newEncapsulatedLogic);
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
	public void setEncapsulatedLogic(TFunctionDefinition newEncapsulatedLogic) {
		if (newEncapsulatedLogic != encapsulatedLogic) {
			NotificationChain msgs = null;
			if (encapsulatedLogic != null)
				msgs = ((InternalEObject)encapsulatedLogic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__ENCAPSULATED_LOGIC, null, msgs);
			if (newEncapsulatedLogic != null)
				msgs = ((InternalEObject)newEncapsulatedLogic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__ENCAPSULATED_LOGIC, null, msgs);
			msgs = basicSetEncapsulatedLogic(newEncapsulatedLogic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__ENCAPSULATED_LOGIC, newEncapsulatedLogic, newEncapsulatedLogic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TKnowledgeRequirement> getKnowledgeRequirement() {
		if (knowledgeRequirement == null) {
			knowledgeRequirement = new EObjectContainmentEList<TKnowledgeRequirement>(TKnowledgeRequirement.class, this, DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__KNOWLEDGE_REQUIREMENT);
		}
		return knowledgeRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAuthorityRequirement> getAuthorityRequirement() {
		if (authorityRequirement == null) {
			authorityRequirement = new EObjectContainmentEList<TAuthorityRequirement>(TAuthorityRequirement.class, this, DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__AUTHORITY_REQUIREMENT);
		}
		return authorityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__ENCAPSULATED_LOGIC:
				return basicSetEncapsulatedLogic(null, msgs);
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__KNOWLEDGE_REQUIREMENT:
				return ((InternalEList<?>)getKnowledgeRequirement()).basicRemove(otherEnd, msgs);
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__AUTHORITY_REQUIREMENT:
				return ((InternalEList<?>)getAuthorityRequirement()).basicRemove(otherEnd, msgs);
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
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__ENCAPSULATED_LOGIC:
				return getEncapsulatedLogic();
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__KNOWLEDGE_REQUIREMENT:
				return getKnowledgeRequirement();
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__AUTHORITY_REQUIREMENT:
				return getAuthorityRequirement();
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
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__ENCAPSULATED_LOGIC:
				setEncapsulatedLogic((TFunctionDefinition)newValue);
				return;
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__KNOWLEDGE_REQUIREMENT:
				getKnowledgeRequirement().clear();
				getKnowledgeRequirement().addAll((Collection<? extends TKnowledgeRequirement>)newValue);
				return;
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__AUTHORITY_REQUIREMENT:
				getAuthorityRequirement().clear();
				getAuthorityRequirement().addAll((Collection<? extends TAuthorityRequirement>)newValue);
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
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__ENCAPSULATED_LOGIC:
				setEncapsulatedLogic((TFunctionDefinition)null);
				return;
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__KNOWLEDGE_REQUIREMENT:
				getKnowledgeRequirement().clear();
				return;
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__AUTHORITY_REQUIREMENT:
				getAuthorityRequirement().clear();
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
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__ENCAPSULATED_LOGIC:
				return encapsulatedLogic != null;
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__KNOWLEDGE_REQUIREMENT:
				return knowledgeRequirement != null && !knowledgeRequirement.isEmpty();
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL__AUTHORITY_REQUIREMENT:
				return authorityRequirement != null && !authorityRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TBusinessKnowledgeModelImpl
