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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.AbstractGeneralDerivedCRSType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.GeneralConversionPropertyType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract General Derived CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGeneralDerivedCRSTypeImpl#getConversionGroup <em>Conversion Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGeneralDerivedCRSTypeImpl#getConversion <em>Conversion</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractGeneralDerivedCRSTypeImpl extends AbstractCRSTypeImpl implements AbstractGeneralDerivedCRSType {
	/**
	 * The cached value of the '{@link #getConversionGroup() <em>Conversion Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap conversionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGeneralDerivedCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractGeneralDerivedCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConversionGroup() {
		if (conversionGroup == null) {
			conversionGroup = new BasicFeatureMap(this, GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION_GROUP);
		}
		return conversionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralConversionPropertyType getConversion() {
		return (GeneralConversionPropertyType)getConversionGroup().get(GMLPackage.eINSTANCE.getAbstractGeneralDerivedCRSType_Conversion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversion(GeneralConversionPropertyType newConversion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getConversionGroup()).basicAdd(GMLPackage.eINSTANCE.getAbstractGeneralDerivedCRSType_Conversion(), newConversion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversion(GeneralConversionPropertyType newConversion) {
		((FeatureMap.Internal)getConversionGroup()).set(GMLPackage.eINSTANCE.getAbstractGeneralDerivedCRSType_Conversion(), newConversion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION_GROUP:
				return ((InternalEList<?>)getConversionGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION:
				return basicSetConversion(null, msgs);
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
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION_GROUP:
				if (coreType) return getConversionGroup();
				return ((FeatureMap.Internal)getConversionGroup()).getWrapper();
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION:
				return getConversion();
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
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION_GROUP:
				((FeatureMap.Internal)getConversionGroup()).set(newValue);
				return;
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION:
				setConversion((GeneralConversionPropertyType)newValue);
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
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION_GROUP:
				getConversionGroup().clear();
				return;
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION:
				setConversion((GeneralConversionPropertyType)null);
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
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION_GROUP:
				return conversionGroup != null && !conversionGroup.isEmpty();
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION:
				return getConversion() != null;
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
		result.append(" (conversionGroup: ");
		result.append(conversionGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractGeneralDerivedCRSTypeImpl
