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
package org.cyclonedx.schema.bom.impl;

import java.util.Collection;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ComponentsType2;
import org.cyclonedx.schema.bom.ServicesType2;
import org.cyclonedx.schema.bom.ToolType;
import org.cyclonedx.schema.bom.ToolsType3;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tools Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ToolsType3Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ToolsType3Impl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ToolsType3Impl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ToolsType3Impl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolsType3Impl extends MinimalEObjectImpl.Container implements ToolsType3 {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected ComponentsType2 components;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected ServicesType2 services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolsType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getToolsType3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, BOMPackage.TOOLS_TYPE3__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToolType> getTool() {
		return getGroup().list(BOMPackage.eINSTANCE.getToolsType3_Tool());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsType2 getComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponents(ComponentsType2 newComponents, NotificationChain msgs) {
		ComponentsType2 oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TOOLS_TYPE3__COMPONENTS, oldComponents, newComponents);
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
	public void setComponents(ComponentsType2 newComponents) {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject)components).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TOOLS_TYPE3__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject)newComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TOOLS_TYPE3__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TOOLS_TYPE3__COMPONENTS, newComponents, newComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicesType2 getServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServices(ServicesType2 newServices, NotificationChain msgs) {
		ServicesType2 oldServices = services;
		services = newServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TOOLS_TYPE3__SERVICES, oldServices, newServices);
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
	public void setServices(ServicesType2 newServices) {
		if (newServices != services) {
			NotificationChain msgs = null;
			if (services != null)
				msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TOOLS_TYPE3__SERVICES, null, msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TOOLS_TYPE3__SERVICES, null, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TOOLS_TYPE3__SERVICES, newServices, newServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.TOOLS_TYPE3__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case BOMPackage.TOOLS_TYPE3__TOOL:
				return ((InternalEList<?>)getTool()).basicRemove(otherEnd, msgs);
			case BOMPackage.TOOLS_TYPE3__COMPONENTS:
				return basicSetComponents(null, msgs);
			case BOMPackage.TOOLS_TYPE3__SERVICES:
				return basicSetServices(null, msgs);
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
			case BOMPackage.TOOLS_TYPE3__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case BOMPackage.TOOLS_TYPE3__TOOL:
				return getTool();
			case BOMPackage.TOOLS_TYPE3__COMPONENTS:
				return getComponents();
			case BOMPackage.TOOLS_TYPE3__SERVICES:
				return getServices();
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
			case BOMPackage.TOOLS_TYPE3__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case BOMPackage.TOOLS_TYPE3__TOOL:
				getTool().clear();
				getTool().addAll((Collection<? extends ToolType>)newValue);
				return;
			case BOMPackage.TOOLS_TYPE3__COMPONENTS:
				setComponents((ComponentsType2)newValue);
				return;
			case BOMPackage.TOOLS_TYPE3__SERVICES:
				setServices((ServicesType2)newValue);
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
			case BOMPackage.TOOLS_TYPE3__GROUP:
				getGroup().clear();
				return;
			case BOMPackage.TOOLS_TYPE3__TOOL:
				getTool().clear();
				return;
			case BOMPackage.TOOLS_TYPE3__COMPONENTS:
				setComponents((ComponentsType2)null);
				return;
			case BOMPackage.TOOLS_TYPE3__SERVICES:
				setServices((ServicesType2)null);
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
			case BOMPackage.TOOLS_TYPE3__GROUP:
				return group != null && !group.isEmpty();
			case BOMPackage.TOOLS_TYPE3__TOOL:
				return !getTool().isEmpty();
			case BOMPackage.TOOLS_TYPE3__COMPONENTS:
				return components != null;
			case BOMPackage.TOOLS_TYPE3__SERVICES:
				return services != null;
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ToolsType3Impl
