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

import org.cyclonedx.schema.bom.AggregateType;
import org.cyclonedx.schema.bom.AssembliesType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.CompositionType;
import org.cyclonedx.schema.bom.DependenciesType;
import org.cyclonedx.schema.bom.VulnerabilitiesType1;

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
 * An implementation of the model object '<em><b>Composition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CompositionTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CompositionTypeImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CompositionTypeImpl#getAssemblies <em>Assemblies</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CompositionTypeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CompositionTypeImpl#getVulnerabilities <em>Vulnerabilities</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CompositionTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionTypeImpl extends MinimalEObjectImpl.Container implements CompositionType {
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
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getCompositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, BOMPackage.COMPOSITION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AggregateType> getAggregate() {
		return getGroup().list(BOMPackage.eINSTANCE.getCompositionType_Aggregate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssembliesType> getAssemblies() {
		return getGroup().list(BOMPackage.eINSTANCE.getCompositionType_Assemblies());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DependenciesType> getDependencies() {
		return getGroup().list(BOMPackage.eINSTANCE.getCompositionType_Dependencies());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VulnerabilitiesType1> getVulnerabilities() {
		return getGroup().list(BOMPackage.eINSTANCE.getCompositionType_Vulnerabilities());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPOSITION_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.COMPOSITION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case BOMPackage.COMPOSITION_TYPE__ASSEMBLIES:
				return ((InternalEList<?>)getAssemblies()).basicRemove(otherEnd, msgs);
			case BOMPackage.COMPOSITION_TYPE__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
			case BOMPackage.COMPOSITION_TYPE__VULNERABILITIES:
				return ((InternalEList<?>)getVulnerabilities()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.COMPOSITION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case BOMPackage.COMPOSITION_TYPE__AGGREGATE:
				return getAggregate();
			case BOMPackage.COMPOSITION_TYPE__ASSEMBLIES:
				return getAssemblies();
			case BOMPackage.COMPOSITION_TYPE__DEPENDENCIES:
				return getDependencies();
			case BOMPackage.COMPOSITION_TYPE__VULNERABILITIES:
				return getVulnerabilities();
			case BOMPackage.COMPOSITION_TYPE__BOM_REF:
				return getBomRef();
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
			case BOMPackage.COMPOSITION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case BOMPackage.COMPOSITION_TYPE__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends AggregateType>)newValue);
				return;
			case BOMPackage.COMPOSITION_TYPE__ASSEMBLIES:
				getAssemblies().clear();
				getAssemblies().addAll((Collection<? extends AssembliesType>)newValue);
				return;
			case BOMPackage.COMPOSITION_TYPE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends DependenciesType>)newValue);
				return;
			case BOMPackage.COMPOSITION_TYPE__VULNERABILITIES:
				getVulnerabilities().clear();
				getVulnerabilities().addAll((Collection<? extends VulnerabilitiesType1>)newValue);
				return;
			case BOMPackage.COMPOSITION_TYPE__BOM_REF:
				setBomRef((String)newValue);
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
			case BOMPackage.COMPOSITION_TYPE__GROUP:
				getGroup().clear();
				return;
			case BOMPackage.COMPOSITION_TYPE__AGGREGATE:
				getAggregate().clear();
				return;
			case BOMPackage.COMPOSITION_TYPE__ASSEMBLIES:
				getAssemblies().clear();
				return;
			case BOMPackage.COMPOSITION_TYPE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case BOMPackage.COMPOSITION_TYPE__VULNERABILITIES:
				getVulnerabilities().clear();
				return;
			case BOMPackage.COMPOSITION_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
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
			case BOMPackage.COMPOSITION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case BOMPackage.COMPOSITION_TYPE__AGGREGATE:
				return !getAggregate().isEmpty();
			case BOMPackage.COMPOSITION_TYPE__ASSEMBLIES:
				return !getAssemblies().isEmpty();
			case BOMPackage.COMPOSITION_TYPE__DEPENDENCIES:
				return !getDependencies().isEmpty();
			case BOMPackage.COMPOSITION_TYPE__VULNERABILITIES:
				return !getVulnerabilities().isEmpty();
			case BOMPackage.COMPOSITION_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
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
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(')');
		return result.toString();
	}

} //CompositionTypeImpl
