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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CICitationPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDPortrayalCatalogueReferenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Portrayal Catalogue Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDPortrayalCatalogueReferenceTypeImpl#getPortrayalCatalogueCitation <em>Portrayal Catalogue Citation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDPortrayalCatalogueReferenceTypeImpl extends AbstractObjectTypeImpl implements MDPortrayalCatalogueReferenceType {
	/**
	 * The cached value of the '{@link #getPortrayalCatalogueCitation() <em>Portrayal Catalogue Citation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrayalCatalogueCitation()
	 * @generated
	 * @ordered
	 */
	protected EList<CICitationPropertyType> portrayalCatalogueCitation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDPortrayalCatalogueReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDPortrayalCatalogueReferenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CICitationPropertyType> getPortrayalCatalogueCitation() {
		if (portrayalCatalogueCitation == null) {
			portrayalCatalogueCitation = new EObjectContainmentEList<CICitationPropertyType>(CICitationPropertyType.class, this, GMDPackage.MD_PORTRAYAL_CATALOGUE_REFERENCE_TYPE__PORTRAYAL_CATALOGUE_CITATION);
		}
		return portrayalCatalogueCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_PORTRAYAL_CATALOGUE_REFERENCE_TYPE__PORTRAYAL_CATALOGUE_CITATION:
				return ((InternalEList<?>)getPortrayalCatalogueCitation()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_PORTRAYAL_CATALOGUE_REFERENCE_TYPE__PORTRAYAL_CATALOGUE_CITATION:
				return getPortrayalCatalogueCitation();
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
			case GMDPackage.MD_PORTRAYAL_CATALOGUE_REFERENCE_TYPE__PORTRAYAL_CATALOGUE_CITATION:
				getPortrayalCatalogueCitation().clear();
				getPortrayalCatalogueCitation().addAll((Collection<? extends CICitationPropertyType>)newValue);
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
			case GMDPackage.MD_PORTRAYAL_CATALOGUE_REFERENCE_TYPE__PORTRAYAL_CATALOGUE_CITATION:
				getPortrayalCatalogueCitation().clear();
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
			case GMDPackage.MD_PORTRAYAL_CATALOGUE_REFERENCE_TYPE__PORTRAYAL_CATALOGUE_CITATION:
				return portrayalCatalogueCitation != null && !portrayalCatalogueCitation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDPortrayalCatalogueReferenceTypeImpl
