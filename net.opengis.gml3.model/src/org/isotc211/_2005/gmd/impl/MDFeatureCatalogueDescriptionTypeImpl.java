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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.GenericNamePropertyType;

import org.isotc211._2005.gmd.CICitationPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Feature Catalogue Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDFeatureCatalogueDescriptionTypeImpl#getComplianceCode <em>Compliance Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDFeatureCatalogueDescriptionTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDFeatureCatalogueDescriptionTypeImpl#getIncludedWithDataset <em>Included With Dataset</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDFeatureCatalogueDescriptionTypeImpl#getFeatureTypes <em>Feature Types</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDFeatureCatalogueDescriptionTypeImpl#getFeatureCatalogueCitation <em>Feature Catalogue Citation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDFeatureCatalogueDescriptionTypeImpl extends AbstractMDContentInformationTypeImpl implements MDFeatureCatalogueDescriptionType {
	/**
	 * The cached value of the '{@link #getComplianceCode() <em>Compliance Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceCode()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType complianceCode;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> language;

	/**
	 * The cached value of the '{@link #getIncludedWithDataset() <em>Included With Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedWithDataset()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType includedWithDataset;

	/**
	 * The cached value of the '{@link #getFeatureTypes() <em>Feature Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericNamePropertyType> featureTypes;

	/**
	 * The cached value of the '{@link #getFeatureCatalogueCitation() <em>Feature Catalogue Citation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCatalogueCitation()
	 * @generated
	 * @ordered
	 */
	protected EList<CICitationPropertyType> featureCatalogueCitation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDFeatureCatalogueDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDFeatureCatalogueDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getComplianceCode() {
		return complianceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplianceCode(BooleanPropertyType newComplianceCode, NotificationChain msgs) {
		BooleanPropertyType oldComplianceCode = complianceCode;
		complianceCode = newComplianceCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__COMPLIANCE_CODE, oldComplianceCode, newComplianceCode);
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
	public void setComplianceCode(BooleanPropertyType newComplianceCode) {
		if (newComplianceCode != complianceCode) {
			NotificationChain msgs = null;
			if (complianceCode != null)
				msgs = ((InternalEObject)complianceCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__COMPLIANCE_CODE, null, msgs);
			if (newComplianceCode != null)
				msgs = ((InternalEObject)newComplianceCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__COMPLIANCE_CODE, null, msgs);
			msgs = basicSetComplianceCode(newComplianceCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__COMPLIANCE_CODE, newComplianceCode, newComplianceCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getLanguage() {
		if (language == null) {
			language = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getIncludedWithDataset() {
		return includedWithDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludedWithDataset(BooleanPropertyType newIncludedWithDataset, NotificationChain msgs) {
		BooleanPropertyType oldIncludedWithDataset = includedWithDataset;
		includedWithDataset = newIncludedWithDataset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__INCLUDED_WITH_DATASET, oldIncludedWithDataset, newIncludedWithDataset);
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
	public void setIncludedWithDataset(BooleanPropertyType newIncludedWithDataset) {
		if (newIncludedWithDataset != includedWithDataset) {
			NotificationChain msgs = null;
			if (includedWithDataset != null)
				msgs = ((InternalEObject)includedWithDataset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__INCLUDED_WITH_DATASET, null, msgs);
			if (newIncludedWithDataset != null)
				msgs = ((InternalEObject)newIncludedWithDataset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__INCLUDED_WITH_DATASET, null, msgs);
			msgs = basicSetIncludedWithDataset(newIncludedWithDataset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__INCLUDED_WITH_DATASET, newIncludedWithDataset, newIncludedWithDataset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericNamePropertyType> getFeatureTypes() {
		if (featureTypes == null) {
			featureTypes = new EObjectContainmentEList<GenericNamePropertyType>(GenericNamePropertyType.class, this, GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__FEATURE_TYPES);
		}
		return featureTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CICitationPropertyType> getFeatureCatalogueCitation() {
		if (featureCatalogueCitation == null) {
			featureCatalogueCitation = new EObjectContainmentEList<CICitationPropertyType>(CICitationPropertyType.class, this, GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__FEATURE_CATALOGUE_CITATION);
		}
		return featureCatalogueCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__COMPLIANCE_CODE:
				return basicSetComplianceCode(null, msgs);
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__INCLUDED_WITH_DATASET:
				return basicSetIncludedWithDataset(null, msgs);
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__FEATURE_TYPES:
				return ((InternalEList<?>)getFeatureTypes()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__FEATURE_CATALOGUE_CITATION:
				return ((InternalEList<?>)getFeatureCatalogueCitation()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__COMPLIANCE_CODE:
				return getComplianceCode();
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__LANGUAGE:
				return getLanguage();
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__INCLUDED_WITH_DATASET:
				return getIncludedWithDataset();
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__FEATURE_TYPES:
				return getFeatureTypes();
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__FEATURE_CATALOGUE_CITATION:
				return getFeatureCatalogueCitation();
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
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__COMPLIANCE_CODE:
				setComplianceCode((BooleanPropertyType)newValue);
				return;
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
				return;
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__INCLUDED_WITH_DATASET:
				setIncludedWithDataset((BooleanPropertyType)newValue);
				return;
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__FEATURE_TYPES:
				getFeatureTypes().clear();
				getFeatureTypes().addAll((Collection<? extends GenericNamePropertyType>)newValue);
				return;
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__FEATURE_CATALOGUE_CITATION:
				getFeatureCatalogueCitation().clear();
				getFeatureCatalogueCitation().addAll((Collection<? extends CICitationPropertyType>)newValue);
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
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__COMPLIANCE_CODE:
				setComplianceCode((BooleanPropertyType)null);
				return;
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__LANGUAGE:
				getLanguage().clear();
				return;
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__INCLUDED_WITH_DATASET:
				setIncludedWithDataset((BooleanPropertyType)null);
				return;
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__FEATURE_TYPES:
				getFeatureTypes().clear();
				return;
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__FEATURE_CATALOGUE_CITATION:
				getFeatureCatalogueCitation().clear();
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
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__COMPLIANCE_CODE:
				return complianceCode != null;
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__LANGUAGE:
				return language != null && !language.isEmpty();
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__INCLUDED_WITH_DATASET:
				return includedWithDataset != null;
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__FEATURE_TYPES:
				return featureTypes != null && !featureTypes.isEmpty();
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE__FEATURE_CATALOGUE_CITATION:
				return featureCatalogueCitation != null && !featureCatalogueCitation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDFeatureCatalogueDescriptionTypeImpl
