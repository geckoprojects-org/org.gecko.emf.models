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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

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

import org.emau.icmvc.ganimed.ttp.cm2.ChildrenType;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateStructureDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Template Structure DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateStructureDTOImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateStructureDTOImpl#getFirstLevelModules <em>First Level Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentTemplateStructureDTOImpl extends MinimalEObjectImpl.Container implements ConsentTemplateStructureDTO {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected ChildrenType children;

	/**
	 * The cached value of the '{@link #getFirstLevelModules() <em>First Level Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstLevelModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleKeyDTO> firstLevelModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentTemplateStructureDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getConsentTemplateStructureDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChildrenType getChildren() {
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildren(ChildrenType newChildren, NotificationChain msgs) {
		ChildrenType oldChildren = children;
		children = newChildren;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__CHILDREN, oldChildren, newChildren);
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
	public void setChildren(ChildrenType newChildren) {
		if (newChildren != children) {
			NotificationChain msgs = null;
			if (children != null)
				msgs = ((InternalEObject)children).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__CHILDREN, null, msgs);
			if (newChildren != null)
				msgs = ((InternalEObject)newChildren).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__CHILDREN, null, msgs);
			msgs = basicSetChildren(newChildren, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__CHILDREN, newChildren, newChildren));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleKeyDTO> getFirstLevelModules() {
		if (firstLevelModules == null) {
			firstLevelModules = new EObjectContainmentEList<ModuleKeyDTO>(ModuleKeyDTO.class, this, Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__FIRST_LEVEL_MODULES);
		}
		return firstLevelModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__CHILDREN:
				return basicSetChildren(null, msgs);
			case Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__FIRST_LEVEL_MODULES:
				return ((InternalEList<?>)getFirstLevelModules()).basicRemove(otherEnd, msgs);
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
			case Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__CHILDREN:
				return getChildren();
			case Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__FIRST_LEVEL_MODULES:
				return getFirstLevelModules();
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
			case Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__CHILDREN:
				setChildren((ChildrenType)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__FIRST_LEVEL_MODULES:
				getFirstLevelModules().clear();
				getFirstLevelModules().addAll((Collection<? extends ModuleKeyDTO>)newValue);
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
			case Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__CHILDREN:
				setChildren((ChildrenType)null);
				return;
			case Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__FIRST_LEVEL_MODULES:
				getFirstLevelModules().clear();
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
			case Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__CHILDREN:
				return children != null;
			case Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO__FIRST_LEVEL_MODULES:
				return firstLevelModules != null && !firstLevelModules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConsentTemplateStructureDTOImpl
