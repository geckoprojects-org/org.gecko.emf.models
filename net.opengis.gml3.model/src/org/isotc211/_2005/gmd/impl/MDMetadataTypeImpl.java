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
import org.isotc211._2005.gco.DatePropertyType;
import org.isotc211._2005.gco.ObjectReferencePropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CIResponsiblePartyPropertyType;
import org.isotc211._2005.gmd.DQDataQualityPropertyType;
import org.isotc211._2005.gmd.DSAggregatePropertyType;
import org.isotc211._2005.gmd.DSDataSetPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDApplicationSchemaInformationPropertyType;
import org.isotc211._2005.gmd.MDCharacterSetCodePropertyType;
import org.isotc211._2005.gmd.MDConstraintsPropertyType;
import org.isotc211._2005.gmd.MDContentInformationPropertyType;
import org.isotc211._2005.gmd.MDDistributionPropertyType;
import org.isotc211._2005.gmd.MDIdentificationPropertyType;
import org.isotc211._2005.gmd.MDMaintenanceInformationPropertyType;
import org.isotc211._2005.gmd.MDMetadataExtensionInformationPropertyType;
import org.isotc211._2005.gmd.MDMetadataType;
import org.isotc211._2005.gmd.MDPortrayalCatalogueReferencePropertyType;
import org.isotc211._2005.gmd.MDReferenceSystemPropertyType;
import org.isotc211._2005.gmd.MDScopeCodePropertyType;
import org.isotc211._2005.gmd.MDSpatialRepresentationPropertyType;
import org.isotc211._2005.gmd.PTLocalePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getFileIdentifier <em>File Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getCharacterSet <em>Character Set</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getParentIdentifier <em>Parent Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getHierarchyLevel <em>Hierarchy Level</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getHierarchyLevelName <em>Hierarchy Level Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getDateStamp <em>Date Stamp</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getMetadataStandardName <em>Metadata Standard Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getMetadataStandardVersion <em>Metadata Standard Version</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getDataSetURI <em>Data Set URI</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getSpatialRepresentationInfo <em>Spatial Representation Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getReferenceSystemInfo <em>Reference System Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getMetadataExtensionInfo <em>Metadata Extension Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getIdentificationInfo <em>Identification Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getContentInfo <em>Content Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getDistributionInfo <em>Distribution Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getDataQualityInfo <em>Data Quality Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getPortrayalCatalogueInfo <em>Portrayal Catalogue Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getMetadataConstraints <em>Metadata Constraints</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getApplicationSchemaInfo <em>Application Schema Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getMetadataMaintenance <em>Metadata Maintenance</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getDescribes <em>Describes</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getFeatureType <em>Feature Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataTypeImpl#getFeatureAttribute <em>Feature Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDMetadataTypeImpl extends AbstractObjectTypeImpl implements MDMetadataType {
	/**
	 * The cached value of the '{@link #getFileIdentifier() <em>File Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileIdentifier()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType fileIdentifier;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType language;

	/**
	 * The cached value of the '{@link #getCharacterSet() <em>Character Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSet()
	 * @generated
	 * @ordered
	 */
	protected MDCharacterSetCodePropertyType characterSet;

	/**
	 * The cached value of the '{@link #getParentIdentifier() <em>Parent Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentIdentifier()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType parentIdentifier;

	/**
	 * The cached value of the '{@link #getHierarchyLevel() <em>Hierarchy Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<MDScopeCodePropertyType> hierarchyLevel;

	/**
	 * The cached value of the '{@link #getHierarchyLevelName() <em>Hierarchy Level Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyLevelName()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> hierarchyLevelName;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<CIResponsiblePartyPropertyType> contact;

	/**
	 * The cached value of the '{@link #getDateStamp() <em>Date Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateStamp()
	 * @generated
	 * @ordered
	 */
	protected DatePropertyType dateStamp;

	/**
	 * The cached value of the '{@link #getMetadataStandardName() <em>Metadata Standard Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataStandardName()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType metadataStandardName;

	/**
	 * The cached value of the '{@link #getMetadataStandardVersion() <em>Metadata Standard Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataStandardVersion()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType metadataStandardVersion;

	/**
	 * The cached value of the '{@link #getDataSetURI() <em>Data Set URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetURI()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType dataSetURI;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected EList<PTLocalePropertyType> locale;

	/**
	 * The cached value of the '{@link #getSpatialRepresentationInfo() <em>Spatial Representation Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialRepresentationInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<MDSpatialRepresentationPropertyType> spatialRepresentationInfo;

	/**
	 * The cached value of the '{@link #getReferenceSystemInfo() <em>Reference System Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSystemInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<MDReferenceSystemPropertyType> referenceSystemInfo;

	/**
	 * The cached value of the '{@link #getMetadataExtensionInfo() <em>Metadata Extension Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataExtensionInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<MDMetadataExtensionInformationPropertyType> metadataExtensionInfo;

	/**
	 * The cached value of the '{@link #getIdentificationInfo() <em>Identification Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<MDIdentificationPropertyType> identificationInfo;

	/**
	 * The cached value of the '{@link #getContentInfo() <em>Content Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<MDContentInformationPropertyType> contentInfo;

	/**
	 * The cached value of the '{@link #getDistributionInfo() <em>Distribution Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionInfo()
	 * @generated
	 * @ordered
	 */
	protected MDDistributionPropertyType distributionInfo;

	/**
	 * The cached value of the '{@link #getDataQualityInfo() <em>Data Quality Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataQualityInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<DQDataQualityPropertyType> dataQualityInfo;

	/**
	 * The cached value of the '{@link #getPortrayalCatalogueInfo() <em>Portrayal Catalogue Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrayalCatalogueInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<MDPortrayalCatalogueReferencePropertyType> portrayalCatalogueInfo;

	/**
	 * The cached value of the '{@link #getMetadataConstraints() <em>Metadata Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<MDConstraintsPropertyType> metadataConstraints;

	/**
	 * The cached value of the '{@link #getApplicationSchemaInfo() <em>Application Schema Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationSchemaInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<MDApplicationSchemaInformationPropertyType> applicationSchemaInfo;

	/**
	 * The cached value of the '{@link #getMetadataMaintenance() <em>Metadata Maintenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataMaintenance()
	 * @generated
	 * @ordered
	 */
	protected MDMaintenanceInformationPropertyType metadataMaintenance;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<DSAggregatePropertyType> series;

	/**
	 * The cached value of the '{@link #getDescribes() <em>Describes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribes()
	 * @generated
	 * @ordered
	 */
	protected EList<DSDataSetPropertyType> describes;

	/**
	 * The cached value of the '{@link #getPropertyType() <em>Property Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyType()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectReferencePropertyType> propertyType;

	/**
	 * The cached value of the '{@link #getFeatureType() <em>Feature Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureType()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectReferencePropertyType> featureType;

	/**
	 * The cached value of the '{@link #getFeatureAttribute() <em>Feature Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectReferencePropertyType> featureAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDMetadataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDMetadataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getFileIdentifier() {
		return fileIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileIdentifier(CharacterStringPropertyType newFileIdentifier, NotificationChain msgs) {
		CharacterStringPropertyType oldFileIdentifier = fileIdentifier;
		fileIdentifier = newFileIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__FILE_IDENTIFIER, oldFileIdentifier, newFileIdentifier);
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
	public void setFileIdentifier(CharacterStringPropertyType newFileIdentifier) {
		if (newFileIdentifier != fileIdentifier) {
			NotificationChain msgs = null;
			if (fileIdentifier != null)
				msgs = ((InternalEObject)fileIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__FILE_IDENTIFIER, null, msgs);
			if (newFileIdentifier != null)
				msgs = ((InternalEObject)newFileIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__FILE_IDENTIFIER, null, msgs);
			msgs = basicSetFileIdentifier(newFileIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__FILE_IDENTIFIER, newFileIdentifier, newFileIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(CharacterStringPropertyType newLanguage, NotificationChain msgs) {
		CharacterStringPropertyType oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__LANGUAGE, oldLanguage, newLanguage);
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
	public void setLanguage(CharacterStringPropertyType newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDCharacterSetCodePropertyType getCharacterSet() {
		return characterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacterSet(MDCharacterSetCodePropertyType newCharacterSet, NotificationChain msgs) {
		MDCharacterSetCodePropertyType oldCharacterSet = characterSet;
		characterSet = newCharacterSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__CHARACTER_SET, oldCharacterSet, newCharacterSet);
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
	public void setCharacterSet(MDCharacterSetCodePropertyType newCharacterSet) {
		if (newCharacterSet != characterSet) {
			NotificationChain msgs = null;
			if (characterSet != null)
				msgs = ((InternalEObject)characterSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__CHARACTER_SET, null, msgs);
			if (newCharacterSet != null)
				msgs = ((InternalEObject)newCharacterSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__CHARACTER_SET, null, msgs);
			msgs = basicSetCharacterSet(newCharacterSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__CHARACTER_SET, newCharacterSet, newCharacterSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getParentIdentifier() {
		return parentIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentIdentifier(CharacterStringPropertyType newParentIdentifier, NotificationChain msgs) {
		CharacterStringPropertyType oldParentIdentifier = parentIdentifier;
		parentIdentifier = newParentIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__PARENT_IDENTIFIER, oldParentIdentifier, newParentIdentifier);
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
	public void setParentIdentifier(CharacterStringPropertyType newParentIdentifier) {
		if (newParentIdentifier != parentIdentifier) {
			NotificationChain msgs = null;
			if (parentIdentifier != null)
				msgs = ((InternalEObject)parentIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__PARENT_IDENTIFIER, null, msgs);
			if (newParentIdentifier != null)
				msgs = ((InternalEObject)newParentIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__PARENT_IDENTIFIER, null, msgs);
			msgs = basicSetParentIdentifier(newParentIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__PARENT_IDENTIFIER, newParentIdentifier, newParentIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDScopeCodePropertyType> getHierarchyLevel() {
		if (hierarchyLevel == null) {
			hierarchyLevel = new EObjectContainmentEList<MDScopeCodePropertyType>(MDScopeCodePropertyType.class, this, GMDPackage.MD_METADATA_TYPE__HIERARCHY_LEVEL);
		}
		return hierarchyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getHierarchyLevelName() {
		if (hierarchyLevelName == null) {
			hierarchyLevelName = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.MD_METADATA_TYPE__HIERARCHY_LEVEL_NAME);
		}
		return hierarchyLevelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CIResponsiblePartyPropertyType> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<CIResponsiblePartyPropertyType>(CIResponsiblePartyPropertyType.class, this, GMDPackage.MD_METADATA_TYPE__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatePropertyType getDateStamp() {
		return dateStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateStamp(DatePropertyType newDateStamp, NotificationChain msgs) {
		DatePropertyType oldDateStamp = dateStamp;
		dateStamp = newDateStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__DATE_STAMP, oldDateStamp, newDateStamp);
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
	public void setDateStamp(DatePropertyType newDateStamp) {
		if (newDateStamp != dateStamp) {
			NotificationChain msgs = null;
			if (dateStamp != null)
				msgs = ((InternalEObject)dateStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__DATE_STAMP, null, msgs);
			if (newDateStamp != null)
				msgs = ((InternalEObject)newDateStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__DATE_STAMP, null, msgs);
			msgs = basicSetDateStamp(newDateStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__DATE_STAMP, newDateStamp, newDateStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getMetadataStandardName() {
		return metadataStandardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadataStandardName(CharacterStringPropertyType newMetadataStandardName, NotificationChain msgs) {
		CharacterStringPropertyType oldMetadataStandardName = metadataStandardName;
		metadataStandardName = newMetadataStandardName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_NAME, oldMetadataStandardName, newMetadataStandardName);
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
	public void setMetadataStandardName(CharacterStringPropertyType newMetadataStandardName) {
		if (newMetadataStandardName != metadataStandardName) {
			NotificationChain msgs = null;
			if (metadataStandardName != null)
				msgs = ((InternalEObject)metadataStandardName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_NAME, null, msgs);
			if (newMetadataStandardName != null)
				msgs = ((InternalEObject)newMetadataStandardName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_NAME, null, msgs);
			msgs = basicSetMetadataStandardName(newMetadataStandardName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_NAME, newMetadataStandardName, newMetadataStandardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getMetadataStandardVersion() {
		return metadataStandardVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadataStandardVersion(CharacterStringPropertyType newMetadataStandardVersion, NotificationChain msgs) {
		CharacterStringPropertyType oldMetadataStandardVersion = metadataStandardVersion;
		metadataStandardVersion = newMetadataStandardVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_VERSION, oldMetadataStandardVersion, newMetadataStandardVersion);
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
	public void setMetadataStandardVersion(CharacterStringPropertyType newMetadataStandardVersion) {
		if (newMetadataStandardVersion != metadataStandardVersion) {
			NotificationChain msgs = null;
			if (metadataStandardVersion != null)
				msgs = ((InternalEObject)metadataStandardVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_VERSION, null, msgs);
			if (newMetadataStandardVersion != null)
				msgs = ((InternalEObject)newMetadataStandardVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_VERSION, null, msgs);
			msgs = basicSetMetadataStandardVersion(newMetadataStandardVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_VERSION, newMetadataStandardVersion, newMetadataStandardVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getDataSetURI() {
		return dataSetURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetURI(CharacterStringPropertyType newDataSetURI, NotificationChain msgs) {
		CharacterStringPropertyType oldDataSetURI = dataSetURI;
		dataSetURI = newDataSetURI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__DATA_SET_URI, oldDataSetURI, newDataSetURI);
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
	public void setDataSetURI(CharacterStringPropertyType newDataSetURI) {
		if (newDataSetURI != dataSetURI) {
			NotificationChain msgs = null;
			if (dataSetURI != null)
				msgs = ((InternalEObject)dataSetURI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__DATA_SET_URI, null, msgs);
			if (newDataSetURI != null)
				msgs = ((InternalEObject)newDataSetURI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__DATA_SET_URI, null, msgs);
			msgs = basicSetDataSetURI(newDataSetURI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__DATA_SET_URI, newDataSetURI, newDataSetURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PTLocalePropertyType> getLocale() {
		if (locale == null) {
			locale = new EObjectContainmentEList<PTLocalePropertyType>(PTLocalePropertyType.class, this, GMDPackage.MD_METADATA_TYPE__LOCALE);
		}
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDSpatialRepresentationPropertyType> getSpatialRepresentationInfo() {
		if (spatialRepresentationInfo == null) {
			spatialRepresentationInfo = new EObjectContainmentEList<MDSpatialRepresentationPropertyType>(MDSpatialRepresentationPropertyType.class, this, GMDPackage.MD_METADATA_TYPE__SPATIAL_REPRESENTATION_INFO);
		}
		return spatialRepresentationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDReferenceSystemPropertyType> getReferenceSystemInfo() {
		if (referenceSystemInfo == null) {
			referenceSystemInfo = new EObjectContainmentEList<MDReferenceSystemPropertyType>(MDReferenceSystemPropertyType.class, this, GMDPackage.MD_METADATA_TYPE__REFERENCE_SYSTEM_INFO);
		}
		return referenceSystemInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDMetadataExtensionInformationPropertyType> getMetadataExtensionInfo() {
		if (metadataExtensionInfo == null) {
			metadataExtensionInfo = new EObjectContainmentEList<MDMetadataExtensionInformationPropertyType>(MDMetadataExtensionInformationPropertyType.class, this, GMDPackage.MD_METADATA_TYPE__METADATA_EXTENSION_INFO);
		}
		return metadataExtensionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDIdentificationPropertyType> getIdentificationInfo() {
		if (identificationInfo == null) {
			identificationInfo = new EObjectContainmentEList<MDIdentificationPropertyType>(MDIdentificationPropertyType.class, this, GMDPackage.MD_METADATA_TYPE__IDENTIFICATION_INFO);
		}
		return identificationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDContentInformationPropertyType> getContentInfo() {
		if (contentInfo == null) {
			contentInfo = new EObjectContainmentEList<MDContentInformationPropertyType>(MDContentInformationPropertyType.class, this, GMDPackage.MD_METADATA_TYPE__CONTENT_INFO);
		}
		return contentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDistributionPropertyType getDistributionInfo() {
		return distributionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistributionInfo(MDDistributionPropertyType newDistributionInfo, NotificationChain msgs) {
		MDDistributionPropertyType oldDistributionInfo = distributionInfo;
		distributionInfo = newDistributionInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__DISTRIBUTION_INFO, oldDistributionInfo, newDistributionInfo);
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
	public void setDistributionInfo(MDDistributionPropertyType newDistributionInfo) {
		if (newDistributionInfo != distributionInfo) {
			NotificationChain msgs = null;
			if (distributionInfo != null)
				msgs = ((InternalEObject)distributionInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__DISTRIBUTION_INFO, null, msgs);
			if (newDistributionInfo != null)
				msgs = ((InternalEObject)newDistributionInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__DISTRIBUTION_INFO, null, msgs);
			msgs = basicSetDistributionInfo(newDistributionInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__DISTRIBUTION_INFO, newDistributionInfo, newDistributionInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DQDataQualityPropertyType> getDataQualityInfo() {
		if (dataQualityInfo == null) {
			dataQualityInfo = new EObjectContainmentEList<DQDataQualityPropertyType>(DQDataQualityPropertyType.class, this, GMDPackage.MD_METADATA_TYPE__DATA_QUALITY_INFO);
		}
		return dataQualityInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDPortrayalCatalogueReferencePropertyType> getPortrayalCatalogueInfo() {
		if (portrayalCatalogueInfo == null) {
			portrayalCatalogueInfo = new EObjectContainmentEList<MDPortrayalCatalogueReferencePropertyType>(MDPortrayalCatalogueReferencePropertyType.class, this, GMDPackage.MD_METADATA_TYPE__PORTRAYAL_CATALOGUE_INFO);
		}
		return portrayalCatalogueInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDConstraintsPropertyType> getMetadataConstraints() {
		if (metadataConstraints == null) {
			metadataConstraints = new EObjectContainmentEList<MDConstraintsPropertyType>(MDConstraintsPropertyType.class, this, GMDPackage.MD_METADATA_TYPE__METADATA_CONSTRAINTS);
		}
		return metadataConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDApplicationSchemaInformationPropertyType> getApplicationSchemaInfo() {
		if (applicationSchemaInfo == null) {
			applicationSchemaInfo = new EObjectContainmentEList<MDApplicationSchemaInformationPropertyType>(MDApplicationSchemaInformationPropertyType.class, this, GMDPackage.MD_METADATA_TYPE__APPLICATION_SCHEMA_INFO);
		}
		return applicationSchemaInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMaintenanceInformationPropertyType getMetadataMaintenance() {
		return metadataMaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadataMaintenance(MDMaintenanceInformationPropertyType newMetadataMaintenance, NotificationChain msgs) {
		MDMaintenanceInformationPropertyType oldMetadataMaintenance = metadataMaintenance;
		metadataMaintenance = newMetadataMaintenance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__METADATA_MAINTENANCE, oldMetadataMaintenance, newMetadataMaintenance);
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
	public void setMetadataMaintenance(MDMaintenanceInformationPropertyType newMetadataMaintenance) {
		if (newMetadataMaintenance != metadataMaintenance) {
			NotificationChain msgs = null;
			if (metadataMaintenance != null)
				msgs = ((InternalEObject)metadataMaintenance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__METADATA_MAINTENANCE, null, msgs);
			if (newMetadataMaintenance != null)
				msgs = ((InternalEObject)newMetadataMaintenance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_TYPE__METADATA_MAINTENANCE, null, msgs);
			msgs = basicSetMetadataMaintenance(newMetadataMaintenance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_TYPE__METADATA_MAINTENANCE, newMetadataMaintenance, newMetadataMaintenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DSAggregatePropertyType> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<DSAggregatePropertyType>(DSAggregatePropertyType.class, this, GMDPackage.MD_METADATA_TYPE__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DSDataSetPropertyType> getDescribes() {
		if (describes == null) {
			describes = new EObjectContainmentEList<DSDataSetPropertyType>(DSDataSetPropertyType.class, this, GMDPackage.MD_METADATA_TYPE__DESCRIBES);
		}
		return describes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectReferencePropertyType> getPropertyType() {
		if (propertyType == null) {
			propertyType = new EObjectContainmentEList<ObjectReferencePropertyType>(ObjectReferencePropertyType.class, this, GMDPackage.MD_METADATA_TYPE__PROPERTY_TYPE);
		}
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectReferencePropertyType> getFeatureType() {
		if (featureType == null) {
			featureType = new EObjectContainmentEList<ObjectReferencePropertyType>(ObjectReferencePropertyType.class, this, GMDPackage.MD_METADATA_TYPE__FEATURE_TYPE);
		}
		return featureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectReferencePropertyType> getFeatureAttribute() {
		if (featureAttribute == null) {
			featureAttribute = new EObjectContainmentEList<ObjectReferencePropertyType>(ObjectReferencePropertyType.class, this, GMDPackage.MD_METADATA_TYPE__FEATURE_ATTRIBUTE);
		}
		return featureAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_METADATA_TYPE__FILE_IDENTIFIER:
				return basicSetFileIdentifier(null, msgs);
			case GMDPackage.MD_METADATA_TYPE__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case GMDPackage.MD_METADATA_TYPE__CHARACTER_SET:
				return basicSetCharacterSet(null, msgs);
			case GMDPackage.MD_METADATA_TYPE__PARENT_IDENTIFIER:
				return basicSetParentIdentifier(null, msgs);
			case GMDPackage.MD_METADATA_TYPE__HIERARCHY_LEVEL:
				return ((InternalEList<?>)getHierarchyLevel()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__HIERARCHY_LEVEL_NAME:
				return ((InternalEList<?>)getHierarchyLevelName()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__DATE_STAMP:
				return basicSetDateStamp(null, msgs);
			case GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_NAME:
				return basicSetMetadataStandardName(null, msgs);
			case GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_VERSION:
				return basicSetMetadataStandardVersion(null, msgs);
			case GMDPackage.MD_METADATA_TYPE__DATA_SET_URI:
				return basicSetDataSetURI(null, msgs);
			case GMDPackage.MD_METADATA_TYPE__LOCALE:
				return ((InternalEList<?>)getLocale()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__SPATIAL_REPRESENTATION_INFO:
				return ((InternalEList<?>)getSpatialRepresentationInfo()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__REFERENCE_SYSTEM_INFO:
				return ((InternalEList<?>)getReferenceSystemInfo()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__METADATA_EXTENSION_INFO:
				return ((InternalEList<?>)getMetadataExtensionInfo()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__IDENTIFICATION_INFO:
				return ((InternalEList<?>)getIdentificationInfo()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__CONTENT_INFO:
				return ((InternalEList<?>)getContentInfo()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__DISTRIBUTION_INFO:
				return basicSetDistributionInfo(null, msgs);
			case GMDPackage.MD_METADATA_TYPE__DATA_QUALITY_INFO:
				return ((InternalEList<?>)getDataQualityInfo()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__PORTRAYAL_CATALOGUE_INFO:
				return ((InternalEList<?>)getPortrayalCatalogueInfo()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__METADATA_CONSTRAINTS:
				return ((InternalEList<?>)getMetadataConstraints()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__APPLICATION_SCHEMA_INFO:
				return ((InternalEList<?>)getApplicationSchemaInfo()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__METADATA_MAINTENANCE:
				return basicSetMetadataMaintenance(null, msgs);
			case GMDPackage.MD_METADATA_TYPE__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__DESCRIBES:
				return ((InternalEList<?>)getDescribes()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__PROPERTY_TYPE:
				return ((InternalEList<?>)getPropertyType()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__FEATURE_TYPE:
				return ((InternalEList<?>)getFeatureType()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_METADATA_TYPE__FEATURE_ATTRIBUTE:
				return ((InternalEList<?>)getFeatureAttribute()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_METADATA_TYPE__FILE_IDENTIFIER:
				return getFileIdentifier();
			case GMDPackage.MD_METADATA_TYPE__LANGUAGE:
				return getLanguage();
			case GMDPackage.MD_METADATA_TYPE__CHARACTER_SET:
				return getCharacterSet();
			case GMDPackage.MD_METADATA_TYPE__PARENT_IDENTIFIER:
				return getParentIdentifier();
			case GMDPackage.MD_METADATA_TYPE__HIERARCHY_LEVEL:
				return getHierarchyLevel();
			case GMDPackage.MD_METADATA_TYPE__HIERARCHY_LEVEL_NAME:
				return getHierarchyLevelName();
			case GMDPackage.MD_METADATA_TYPE__CONTACT:
				return getContact();
			case GMDPackage.MD_METADATA_TYPE__DATE_STAMP:
				return getDateStamp();
			case GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_NAME:
				return getMetadataStandardName();
			case GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_VERSION:
				return getMetadataStandardVersion();
			case GMDPackage.MD_METADATA_TYPE__DATA_SET_URI:
				return getDataSetURI();
			case GMDPackage.MD_METADATA_TYPE__LOCALE:
				return getLocale();
			case GMDPackage.MD_METADATA_TYPE__SPATIAL_REPRESENTATION_INFO:
				return getSpatialRepresentationInfo();
			case GMDPackage.MD_METADATA_TYPE__REFERENCE_SYSTEM_INFO:
				return getReferenceSystemInfo();
			case GMDPackage.MD_METADATA_TYPE__METADATA_EXTENSION_INFO:
				return getMetadataExtensionInfo();
			case GMDPackage.MD_METADATA_TYPE__IDENTIFICATION_INFO:
				return getIdentificationInfo();
			case GMDPackage.MD_METADATA_TYPE__CONTENT_INFO:
				return getContentInfo();
			case GMDPackage.MD_METADATA_TYPE__DISTRIBUTION_INFO:
				return getDistributionInfo();
			case GMDPackage.MD_METADATA_TYPE__DATA_QUALITY_INFO:
				return getDataQualityInfo();
			case GMDPackage.MD_METADATA_TYPE__PORTRAYAL_CATALOGUE_INFO:
				return getPortrayalCatalogueInfo();
			case GMDPackage.MD_METADATA_TYPE__METADATA_CONSTRAINTS:
				return getMetadataConstraints();
			case GMDPackage.MD_METADATA_TYPE__APPLICATION_SCHEMA_INFO:
				return getApplicationSchemaInfo();
			case GMDPackage.MD_METADATA_TYPE__METADATA_MAINTENANCE:
				return getMetadataMaintenance();
			case GMDPackage.MD_METADATA_TYPE__SERIES:
				return getSeries();
			case GMDPackage.MD_METADATA_TYPE__DESCRIBES:
				return getDescribes();
			case GMDPackage.MD_METADATA_TYPE__PROPERTY_TYPE:
				return getPropertyType();
			case GMDPackage.MD_METADATA_TYPE__FEATURE_TYPE:
				return getFeatureType();
			case GMDPackage.MD_METADATA_TYPE__FEATURE_ATTRIBUTE:
				return getFeatureAttribute();
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
			case GMDPackage.MD_METADATA_TYPE__FILE_IDENTIFIER:
				setFileIdentifier((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__LANGUAGE:
				setLanguage((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__CHARACTER_SET:
				setCharacterSet((MDCharacterSetCodePropertyType)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__PARENT_IDENTIFIER:
				setParentIdentifier((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__HIERARCHY_LEVEL:
				getHierarchyLevel().clear();
				getHierarchyLevel().addAll((Collection<? extends MDScopeCodePropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__HIERARCHY_LEVEL_NAME:
				getHierarchyLevelName().clear();
				getHierarchyLevelName().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends CIResponsiblePartyPropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__DATE_STAMP:
				setDateStamp((DatePropertyType)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_NAME:
				setMetadataStandardName((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_VERSION:
				setMetadataStandardVersion((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__DATA_SET_URI:
				setDataSetURI((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__LOCALE:
				getLocale().clear();
				getLocale().addAll((Collection<? extends PTLocalePropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__SPATIAL_REPRESENTATION_INFO:
				getSpatialRepresentationInfo().clear();
				getSpatialRepresentationInfo().addAll((Collection<? extends MDSpatialRepresentationPropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__REFERENCE_SYSTEM_INFO:
				getReferenceSystemInfo().clear();
				getReferenceSystemInfo().addAll((Collection<? extends MDReferenceSystemPropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__METADATA_EXTENSION_INFO:
				getMetadataExtensionInfo().clear();
				getMetadataExtensionInfo().addAll((Collection<? extends MDMetadataExtensionInformationPropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__IDENTIFICATION_INFO:
				getIdentificationInfo().clear();
				getIdentificationInfo().addAll((Collection<? extends MDIdentificationPropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__CONTENT_INFO:
				getContentInfo().clear();
				getContentInfo().addAll((Collection<? extends MDContentInformationPropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__DISTRIBUTION_INFO:
				setDistributionInfo((MDDistributionPropertyType)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__DATA_QUALITY_INFO:
				getDataQualityInfo().clear();
				getDataQualityInfo().addAll((Collection<? extends DQDataQualityPropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__PORTRAYAL_CATALOGUE_INFO:
				getPortrayalCatalogueInfo().clear();
				getPortrayalCatalogueInfo().addAll((Collection<? extends MDPortrayalCatalogueReferencePropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__METADATA_CONSTRAINTS:
				getMetadataConstraints().clear();
				getMetadataConstraints().addAll((Collection<? extends MDConstraintsPropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__APPLICATION_SCHEMA_INFO:
				getApplicationSchemaInfo().clear();
				getApplicationSchemaInfo().addAll((Collection<? extends MDApplicationSchemaInformationPropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__METADATA_MAINTENANCE:
				setMetadataMaintenance((MDMaintenanceInformationPropertyType)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends DSAggregatePropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__DESCRIBES:
				getDescribes().clear();
				getDescribes().addAll((Collection<? extends DSDataSetPropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__PROPERTY_TYPE:
				getPropertyType().clear();
				getPropertyType().addAll((Collection<? extends ObjectReferencePropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__FEATURE_TYPE:
				getFeatureType().clear();
				getFeatureType().addAll((Collection<? extends ObjectReferencePropertyType>)newValue);
				return;
			case GMDPackage.MD_METADATA_TYPE__FEATURE_ATTRIBUTE:
				getFeatureAttribute().clear();
				getFeatureAttribute().addAll((Collection<? extends ObjectReferencePropertyType>)newValue);
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
			case GMDPackage.MD_METADATA_TYPE__FILE_IDENTIFIER:
				setFileIdentifier((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_METADATA_TYPE__LANGUAGE:
				setLanguage((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_METADATA_TYPE__CHARACTER_SET:
				setCharacterSet((MDCharacterSetCodePropertyType)null);
				return;
			case GMDPackage.MD_METADATA_TYPE__PARENT_IDENTIFIER:
				setParentIdentifier((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_METADATA_TYPE__HIERARCHY_LEVEL:
				getHierarchyLevel().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__HIERARCHY_LEVEL_NAME:
				getHierarchyLevelName().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__CONTACT:
				getContact().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__DATE_STAMP:
				setDateStamp((DatePropertyType)null);
				return;
			case GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_NAME:
				setMetadataStandardName((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_VERSION:
				setMetadataStandardVersion((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_METADATA_TYPE__DATA_SET_URI:
				setDataSetURI((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_METADATA_TYPE__LOCALE:
				getLocale().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__SPATIAL_REPRESENTATION_INFO:
				getSpatialRepresentationInfo().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__REFERENCE_SYSTEM_INFO:
				getReferenceSystemInfo().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__METADATA_EXTENSION_INFO:
				getMetadataExtensionInfo().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__IDENTIFICATION_INFO:
				getIdentificationInfo().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__CONTENT_INFO:
				getContentInfo().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__DISTRIBUTION_INFO:
				setDistributionInfo((MDDistributionPropertyType)null);
				return;
			case GMDPackage.MD_METADATA_TYPE__DATA_QUALITY_INFO:
				getDataQualityInfo().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__PORTRAYAL_CATALOGUE_INFO:
				getPortrayalCatalogueInfo().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__METADATA_CONSTRAINTS:
				getMetadataConstraints().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__APPLICATION_SCHEMA_INFO:
				getApplicationSchemaInfo().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__METADATA_MAINTENANCE:
				setMetadataMaintenance((MDMaintenanceInformationPropertyType)null);
				return;
			case GMDPackage.MD_METADATA_TYPE__SERIES:
				getSeries().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__DESCRIBES:
				getDescribes().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__PROPERTY_TYPE:
				getPropertyType().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__FEATURE_TYPE:
				getFeatureType().clear();
				return;
			case GMDPackage.MD_METADATA_TYPE__FEATURE_ATTRIBUTE:
				getFeatureAttribute().clear();
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
			case GMDPackage.MD_METADATA_TYPE__FILE_IDENTIFIER:
				return fileIdentifier != null;
			case GMDPackage.MD_METADATA_TYPE__LANGUAGE:
				return language != null;
			case GMDPackage.MD_METADATA_TYPE__CHARACTER_SET:
				return characterSet != null;
			case GMDPackage.MD_METADATA_TYPE__PARENT_IDENTIFIER:
				return parentIdentifier != null;
			case GMDPackage.MD_METADATA_TYPE__HIERARCHY_LEVEL:
				return hierarchyLevel != null && !hierarchyLevel.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__HIERARCHY_LEVEL_NAME:
				return hierarchyLevelName != null && !hierarchyLevelName.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__CONTACT:
				return contact != null && !contact.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__DATE_STAMP:
				return dateStamp != null;
			case GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_NAME:
				return metadataStandardName != null;
			case GMDPackage.MD_METADATA_TYPE__METADATA_STANDARD_VERSION:
				return metadataStandardVersion != null;
			case GMDPackage.MD_METADATA_TYPE__DATA_SET_URI:
				return dataSetURI != null;
			case GMDPackage.MD_METADATA_TYPE__LOCALE:
				return locale != null && !locale.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__SPATIAL_REPRESENTATION_INFO:
				return spatialRepresentationInfo != null && !spatialRepresentationInfo.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__REFERENCE_SYSTEM_INFO:
				return referenceSystemInfo != null && !referenceSystemInfo.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__METADATA_EXTENSION_INFO:
				return metadataExtensionInfo != null && !metadataExtensionInfo.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__IDENTIFICATION_INFO:
				return identificationInfo != null && !identificationInfo.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__CONTENT_INFO:
				return contentInfo != null && !contentInfo.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__DISTRIBUTION_INFO:
				return distributionInfo != null;
			case GMDPackage.MD_METADATA_TYPE__DATA_QUALITY_INFO:
				return dataQualityInfo != null && !dataQualityInfo.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__PORTRAYAL_CATALOGUE_INFO:
				return portrayalCatalogueInfo != null && !portrayalCatalogueInfo.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__METADATA_CONSTRAINTS:
				return metadataConstraints != null && !metadataConstraints.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__APPLICATION_SCHEMA_INFO:
				return applicationSchemaInfo != null && !applicationSchemaInfo.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__METADATA_MAINTENANCE:
				return metadataMaintenance != null;
			case GMDPackage.MD_METADATA_TYPE__SERIES:
				return series != null && !series.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__DESCRIBES:
				return describes != null && !describes.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__PROPERTY_TYPE:
				return propertyType != null && !propertyType.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__FEATURE_TYPE:
				return featureType != null && !featureType.isEmpty();
			case GMDPackage.MD_METADATA_TYPE__FEATURE_ATTRIBUTE:
				return featureAttribute != null && !featureAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDMetadataTypeImpl
