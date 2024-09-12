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

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gmd.EXExtentPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDCharacterSetCodePropertyType;
import org.isotc211._2005.gmd.MDDataIdentificationType;
import org.isotc211._2005.gmd.MDResolutionPropertyType;
import org.isotc211._2005.gmd.MDSpatialRepresentationTypeCodePropertyType;
import org.isotc211._2005.gmd.MDTopicCategoryCodePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Data Identification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDataIdentificationTypeImpl#getSpatialRepresentationType <em>Spatial Representation Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDataIdentificationTypeImpl#getSpatialResolution <em>Spatial Resolution</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDataIdentificationTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDataIdentificationTypeImpl#getCharacterSet <em>Character Set</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDataIdentificationTypeImpl#getTopicCategory <em>Topic Category</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDataIdentificationTypeImpl#getEnvironmentDescription <em>Environment Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDataIdentificationTypeImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDataIdentificationTypeImpl#getSupplementalInformation <em>Supplemental Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDDataIdentificationTypeImpl extends AbstractMDIdentificationTypeImpl implements MDDataIdentificationType {
	/**
	 * The cached value of the '{@link #getSpatialRepresentationType() <em>Spatial Representation Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialRepresentationType()
	 * @generated
	 * @ordered
	 */
	protected EList<MDSpatialRepresentationTypeCodePropertyType> spatialRepresentationType;

	/**
	 * The cached value of the '{@link #getSpatialResolution() <em>Spatial Resolution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialResolution()
	 * @generated
	 * @ordered
	 */
	protected EList<MDResolutionPropertyType> spatialResolution;

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
	 * The cached value of the '{@link #getCharacterSet() <em>Character Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSet()
	 * @generated
	 * @ordered
	 */
	protected EList<MDCharacterSetCodePropertyType> characterSet;

	/**
	 * The cached value of the '{@link #getTopicCategory() <em>Topic Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<MDTopicCategoryCodePropertyType> topicCategory;

	/**
	 * The cached value of the '{@link #getEnvironmentDescription() <em>Environment Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentDescription()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType environmentDescription;

	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected EList<EXExtentPropertyType> extent;

	/**
	 * The cached value of the '{@link #getSupplementalInformation() <em>Supplemental Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalInformation()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType supplementalInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDDataIdentificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDDataIdentificationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDSpatialRepresentationTypeCodePropertyType> getSpatialRepresentationType() {
		if (spatialRepresentationType == null) {
			spatialRepresentationType = new EObjectContainmentEList<MDSpatialRepresentationTypeCodePropertyType>(MDSpatialRepresentationTypeCodePropertyType.class, this, GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SPATIAL_REPRESENTATION_TYPE);
		}
		return spatialRepresentationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDResolutionPropertyType> getSpatialResolution() {
		if (spatialResolution == null) {
			spatialResolution = new EObjectContainmentEList<MDResolutionPropertyType>(MDResolutionPropertyType.class, this, GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SPATIAL_RESOLUTION);
		}
		return spatialResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getLanguage() {
		if (language == null) {
			language = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.MD_DATA_IDENTIFICATION_TYPE__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDCharacterSetCodePropertyType> getCharacterSet() {
		if (characterSet == null) {
			characterSet = new EObjectContainmentEList<MDCharacterSetCodePropertyType>(MDCharacterSetCodePropertyType.class, this, GMDPackage.MD_DATA_IDENTIFICATION_TYPE__CHARACTER_SET);
		}
		return characterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDTopicCategoryCodePropertyType> getTopicCategory() {
		if (topicCategory == null) {
			topicCategory = new EObjectContainmentEList<MDTopicCategoryCodePropertyType>(MDTopicCategoryCodePropertyType.class, this, GMDPackage.MD_DATA_IDENTIFICATION_TYPE__TOPIC_CATEGORY);
		}
		return topicCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getEnvironmentDescription() {
		return environmentDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentDescription(CharacterStringPropertyType newEnvironmentDescription, NotificationChain msgs) {
		CharacterStringPropertyType oldEnvironmentDescription = environmentDescription;
		environmentDescription = newEnvironmentDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DATA_IDENTIFICATION_TYPE__ENVIRONMENT_DESCRIPTION, oldEnvironmentDescription, newEnvironmentDescription);
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
	public void setEnvironmentDescription(CharacterStringPropertyType newEnvironmentDescription) {
		if (newEnvironmentDescription != environmentDescription) {
			NotificationChain msgs = null;
			if (environmentDescription != null)
				msgs = ((InternalEObject)environmentDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DATA_IDENTIFICATION_TYPE__ENVIRONMENT_DESCRIPTION, null, msgs);
			if (newEnvironmentDescription != null)
				msgs = ((InternalEObject)newEnvironmentDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DATA_IDENTIFICATION_TYPE__ENVIRONMENT_DESCRIPTION, null, msgs);
			msgs = basicSetEnvironmentDescription(newEnvironmentDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DATA_IDENTIFICATION_TYPE__ENVIRONMENT_DESCRIPTION, newEnvironmentDescription, newEnvironmentDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EXExtentPropertyType> getExtent() {
		if (extent == null) {
			extent = new EObjectContainmentEList<EXExtentPropertyType>(EXExtentPropertyType.class, this, GMDPackage.MD_DATA_IDENTIFICATION_TYPE__EXTENT);
		}
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getSupplementalInformation() {
		return supplementalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplementalInformation(CharacterStringPropertyType newSupplementalInformation, NotificationChain msgs) {
		CharacterStringPropertyType oldSupplementalInformation = supplementalInformation;
		supplementalInformation = newSupplementalInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SUPPLEMENTAL_INFORMATION, oldSupplementalInformation, newSupplementalInformation);
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
	public void setSupplementalInformation(CharacterStringPropertyType newSupplementalInformation) {
		if (newSupplementalInformation != supplementalInformation) {
			NotificationChain msgs = null;
			if (supplementalInformation != null)
				msgs = ((InternalEObject)supplementalInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SUPPLEMENTAL_INFORMATION, null, msgs);
			if (newSupplementalInformation != null)
				msgs = ((InternalEObject)newSupplementalInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SUPPLEMENTAL_INFORMATION, null, msgs);
			msgs = basicSetSupplementalInformation(newSupplementalInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SUPPLEMENTAL_INFORMATION, newSupplementalInformation, newSupplementalInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SPATIAL_REPRESENTATION_TYPE:
				return ((InternalEList<?>)getSpatialRepresentationType()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SPATIAL_RESOLUTION:
				return ((InternalEList<?>)getSpatialResolution()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__CHARACTER_SET:
				return ((InternalEList<?>)getCharacterSet()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__TOPIC_CATEGORY:
				return ((InternalEList<?>)getTopicCategory()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__ENVIRONMENT_DESCRIPTION:
				return basicSetEnvironmentDescription(null, msgs);
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__EXTENT:
				return ((InternalEList<?>)getExtent()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SUPPLEMENTAL_INFORMATION:
				return basicSetSupplementalInformation(null, msgs);
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
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SPATIAL_REPRESENTATION_TYPE:
				return getSpatialRepresentationType();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SPATIAL_RESOLUTION:
				return getSpatialResolution();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__LANGUAGE:
				return getLanguage();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__CHARACTER_SET:
				return getCharacterSet();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__TOPIC_CATEGORY:
				return getTopicCategory();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__ENVIRONMENT_DESCRIPTION:
				return getEnvironmentDescription();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__EXTENT:
				return getExtent();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SUPPLEMENTAL_INFORMATION:
				return getSupplementalInformation();
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
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SPATIAL_REPRESENTATION_TYPE:
				getSpatialRepresentationType().clear();
				getSpatialRepresentationType().addAll((Collection<? extends MDSpatialRepresentationTypeCodePropertyType>)newValue);
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SPATIAL_RESOLUTION:
				getSpatialResolution().clear();
				getSpatialResolution().addAll((Collection<? extends MDResolutionPropertyType>)newValue);
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__CHARACTER_SET:
				getCharacterSet().clear();
				getCharacterSet().addAll((Collection<? extends MDCharacterSetCodePropertyType>)newValue);
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__TOPIC_CATEGORY:
				getTopicCategory().clear();
				getTopicCategory().addAll((Collection<? extends MDTopicCategoryCodePropertyType>)newValue);
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__ENVIRONMENT_DESCRIPTION:
				setEnvironmentDescription((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__EXTENT:
				getExtent().clear();
				getExtent().addAll((Collection<? extends EXExtentPropertyType>)newValue);
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SUPPLEMENTAL_INFORMATION:
				setSupplementalInformation((CharacterStringPropertyType)newValue);
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
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SPATIAL_REPRESENTATION_TYPE:
				getSpatialRepresentationType().clear();
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SPATIAL_RESOLUTION:
				getSpatialResolution().clear();
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__LANGUAGE:
				getLanguage().clear();
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__CHARACTER_SET:
				getCharacterSet().clear();
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__TOPIC_CATEGORY:
				getTopicCategory().clear();
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__ENVIRONMENT_DESCRIPTION:
				setEnvironmentDescription((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__EXTENT:
				getExtent().clear();
				return;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SUPPLEMENTAL_INFORMATION:
				setSupplementalInformation((CharacterStringPropertyType)null);
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
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SPATIAL_REPRESENTATION_TYPE:
				return spatialRepresentationType != null && !spatialRepresentationType.isEmpty();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SPATIAL_RESOLUTION:
				return spatialResolution != null && !spatialResolution.isEmpty();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__LANGUAGE:
				return language != null && !language.isEmpty();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__CHARACTER_SET:
				return characterSet != null && !characterSet.isEmpty();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__TOPIC_CATEGORY:
				return topicCategory != null && !topicCategory.isEmpty();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__ENVIRONMENT_DESCRIPTION:
				return environmentDescription != null;
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__EXTENT:
				return extent != null && !extent.isEmpty();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE__SUPPLEMENTAL_INFORMATION:
				return supplementalInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //MDDataIdentificationTypeImpl
