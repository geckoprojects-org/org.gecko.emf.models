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
package net.opengis.ogc.features.sf.impl;

import net.opengis.gml.gml.AbstractFeatureType;

import net.opengis.gml.gml.impl.AbstractFeatureMemberTypeImpl;

import net.opengis.ogc.features.sf.FeatureMember;
import net.opengis.ogc.features.sf.SFPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.sf.impl.FeatureMemberImpl#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 *   <li>{@link net.opengis.ogc.features.sf.impl.FeatureMemberImpl#getAbstractFeature <em>Abstract Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureMemberImpl extends AbstractFeatureMemberTypeImpl implements FeatureMember {
	/**
	 * The cached value of the '{@link #getAbstractFeatureGroup() <em>Abstract Feature Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFeatureGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractFeatureGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SFPackage.Literals.FEATURE_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractFeatureGroup() {
		if (abstractFeatureGroup == null) {
			abstractFeatureGroup = new BasicFeatureMap(this, SFPackage.FEATURE_MEMBER__ABSTRACT_FEATURE_GROUP);
		}
		return abstractFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractFeatureType getAbstractFeature() {
		return (AbstractFeatureType)getAbstractFeatureGroup().get(SFPackage.Literals.FEATURE_MEMBER__ABSTRACT_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractFeature(AbstractFeatureType newAbstractFeature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractFeatureGroup()).basicAdd(SFPackage.Literals.FEATURE_MEMBER__ABSTRACT_FEATURE, newAbstractFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SFPackage.FEATURE_MEMBER__ABSTRACT_FEATURE_GROUP:
				return ((InternalEList<?>)getAbstractFeatureGroup()).basicRemove(otherEnd, msgs);
			case SFPackage.FEATURE_MEMBER__ABSTRACT_FEATURE:
				return basicSetAbstractFeature(null, msgs);
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
			case SFPackage.FEATURE_MEMBER__ABSTRACT_FEATURE_GROUP:
				if (coreType) return getAbstractFeatureGroup();
				return ((FeatureMap.Internal)getAbstractFeatureGroup()).getWrapper();
			case SFPackage.FEATURE_MEMBER__ABSTRACT_FEATURE:
				return getAbstractFeature();
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
			case SFPackage.FEATURE_MEMBER__ABSTRACT_FEATURE_GROUP:
				((FeatureMap.Internal)getAbstractFeatureGroup()).set(newValue);
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
			case SFPackage.FEATURE_MEMBER__ABSTRACT_FEATURE_GROUP:
				getAbstractFeatureGroup().clear();
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
			case SFPackage.FEATURE_MEMBER__ABSTRACT_FEATURE_GROUP:
				return abstractFeatureGroup != null && !abstractFeatureGroup.isEmpty();
			case SFPackage.FEATURE_MEMBER__ABSTRACT_FEATURE:
				return getAbstractFeature() != null;
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
		result.append(" (abstractFeatureGroup: ");
		result.append(abstractFeatureGroup);
		result.append(')');
		return result.toString();
	}

} //FeatureMemberImpl
