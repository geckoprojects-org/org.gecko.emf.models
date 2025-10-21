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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeSectionType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SectionType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SectionTypeImpl#getCompoundStrokeSectionGroup <em>Compound Stroke Section Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SectionTypeImpl#getCompoundStrokeSection <em>Compound Stroke Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionTypeImpl extends MinimalEObjectImpl.Container implements SectionType {
	/**
	 * The cached value of the '{@link #getCompoundStrokeSectionGroup() <em>Compound Stroke Section Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundStrokeSectionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap compoundStrokeSectionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getSectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCompoundStrokeSectionGroup() {
		if (compoundStrokeSectionGroup == null) {
			compoundStrokeSectionGroup = new BasicFeatureMap(this, AAAPackage.SECTION_TYPE__COMPOUND_STROKE_SECTION_GROUP);
		}
		return compoundStrokeSectionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundStrokeSectionType getCompoundStrokeSection() {
		return (CompoundStrokeSectionType)getCompoundStrokeSectionGroup().get(AAAPackage.eINSTANCE.getSectionType_CompoundStrokeSection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundStrokeSection(CompoundStrokeSectionType newCompoundStrokeSection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getCompoundStrokeSectionGroup()).basicAdd(AAAPackage.eINSTANCE.getSectionType_CompoundStrokeSection(), newCompoundStrokeSection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.SECTION_TYPE__COMPOUND_STROKE_SECTION_GROUP:
				return ((InternalEList<?>)getCompoundStrokeSectionGroup()).basicRemove(otherEnd, msgs);
			case AAAPackage.SECTION_TYPE__COMPOUND_STROKE_SECTION:
				return basicSetCompoundStrokeSection(null, msgs);
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
			case AAAPackage.SECTION_TYPE__COMPOUND_STROKE_SECTION_GROUP:
				if (coreType) return getCompoundStrokeSectionGroup();
				return ((FeatureMap.Internal)getCompoundStrokeSectionGroup()).getWrapper();
			case AAAPackage.SECTION_TYPE__COMPOUND_STROKE_SECTION:
				return getCompoundStrokeSection();
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
			case AAAPackage.SECTION_TYPE__COMPOUND_STROKE_SECTION_GROUP:
				((FeatureMap.Internal)getCompoundStrokeSectionGroup()).set(newValue);
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
			case AAAPackage.SECTION_TYPE__COMPOUND_STROKE_SECTION_GROUP:
				getCompoundStrokeSectionGroup().clear();
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
			case AAAPackage.SECTION_TYPE__COMPOUND_STROKE_SECTION_GROUP:
				return compoundStrokeSectionGroup != null && !compoundStrokeSectionGroup.isEmpty();
			case AAAPackage.SECTION_TYPE__COMPOUND_STROKE_SECTION:
				return getCompoundStrokeSection() != null;
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
		result.append(" (compoundStrokeSectionGroup: ");
		result.append(compoundStrokeSectionGroup);
		result.append(')');
		return result.toString();
	}

} //SectionTypeImpl
