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

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.AbstractMDIdentificationType;
import org.isotc211._2005.gmd.CICitationPropertyType;
import org.isotc211._2005.gmd.CIResponsiblePartyPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDAggregateInformationPropertyType;
import org.isotc211._2005.gmd.MDBrowseGraphicPropertyType;
import org.isotc211._2005.gmd.MDConstraintsPropertyType;
import org.isotc211._2005.gmd.MDFormatPropertyType;
import org.isotc211._2005.gmd.MDKeywordsPropertyType;
import org.isotc211._2005.gmd.MDMaintenanceInformationPropertyType;
import org.isotc211._2005.gmd.MDProgressCodePropertyType;
import org.isotc211._2005.gmd.MDUsagePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract MD Identification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getCredit <em>Credit</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getPointOfContact <em>Point Of Contact</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getResourceMaintenance <em>Resource Maintenance</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getGraphicOverview <em>Graphic Overview</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getResourceFormat <em>Resource Format</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getDescriptiveKeywords <em>Descriptive Keywords</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getResourceSpecificUsage <em>Resource Specific Usage</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getResourceConstraints <em>Resource Constraints</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractMDIdentificationTypeImpl#getAggregationInfo <em>Aggregation Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractMDIdentificationTypeImpl extends AbstractObjectTypeImpl implements AbstractMDIdentificationType {
	/**
	 * The cached value of the '{@link #getCitation() <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected CICitationPropertyType citation;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType abstract_;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType purpose;

	/**
	 * The cached value of the '{@link #getCredit() <em>Credit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> credit;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<MDProgressCodePropertyType> status;

	/**
	 * The cached value of the '{@link #getPointOfContact() <em>Point Of Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOfContact()
	 * @generated
	 * @ordered
	 */
	protected EList<CIResponsiblePartyPropertyType> pointOfContact;

	/**
	 * The cached value of the '{@link #getResourceMaintenance() <em>Resource Maintenance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceMaintenance()
	 * @generated
	 * @ordered
	 */
	protected EList<MDMaintenanceInformationPropertyType> resourceMaintenance;

	/**
	 * The cached value of the '{@link #getGraphicOverview() <em>Graphic Overview</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicOverview()
	 * @generated
	 * @ordered
	 */
	protected EList<MDBrowseGraphicPropertyType> graphicOverview;

	/**
	 * The cached value of the '{@link #getResourceFormat() <em>Resource Format</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<MDFormatPropertyType> resourceFormat;

	/**
	 * The cached value of the '{@link #getDescriptiveKeywords() <em>Descriptive Keywords</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptiveKeywords()
	 * @generated
	 * @ordered
	 */
	protected EList<MDKeywordsPropertyType> descriptiveKeywords;

	/**
	 * The cached value of the '{@link #getResourceSpecificUsage() <em>Resource Specific Usage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSpecificUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<MDUsagePropertyType> resourceSpecificUsage;

	/**
	 * The cached value of the '{@link #getResourceConstraints() <em>Resource Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<MDConstraintsPropertyType> resourceConstraints;

	/**
	 * The cached value of the '{@link #getAggregationInfo() <em>Aggregation Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<MDAggregateInformationPropertyType> aggregationInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMDIdentificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getAbstractMDIdentificationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICitationPropertyType getCitation() {
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitation(CICitationPropertyType newCitation, NotificationChain msgs) {
		CICitationPropertyType oldCitation = citation;
		citation = newCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CITATION, oldCitation, newCitation);
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
	public void setCitation(CICitationPropertyType newCitation) {
		if (newCitation != citation) {
			NotificationChain msgs = null;
			if (citation != null)
				msgs = ((InternalEObject)citation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CITATION, null, msgs);
			if (newCitation != null)
				msgs = ((InternalEObject)newCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CITATION, null, msgs);
			msgs = basicSetCitation(newCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CITATION, newCitation, newCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(CharacterStringPropertyType newAbstract, NotificationChain msgs) {
		CharacterStringPropertyType oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__ABSTRACT, oldAbstract, newAbstract);
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
	public void setAbstract(CharacterStringPropertyType newAbstract) {
		if (newAbstract != abstract_) {
			NotificationChain msgs = null;
			if (abstract_ != null)
				msgs = ((InternalEObject)abstract_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__ABSTRACT, null, msgs);
			if (newAbstract != null)
				msgs = ((InternalEObject)newAbstract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__ABSTRACT, null, msgs);
			msgs = basicSetAbstract(newAbstract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__ABSTRACT, newAbstract, newAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(CharacterStringPropertyType newPurpose, NotificationChain msgs) {
		CharacterStringPropertyType oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__PURPOSE, oldPurpose, newPurpose);
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
	public void setPurpose(CharacterStringPropertyType newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getCredit() {
		if (credit == null) {
			credit = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CREDIT);
		}
		return credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDProgressCodePropertyType> getStatus() {
		if (status == null) {
			status = new EObjectContainmentEList<MDProgressCodePropertyType>(MDProgressCodePropertyType.class, this, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__STATUS);
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CIResponsiblePartyPropertyType> getPointOfContact() {
		if (pointOfContact == null) {
			pointOfContact = new EObjectContainmentEList<CIResponsiblePartyPropertyType>(CIResponsiblePartyPropertyType.class, this, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__POINT_OF_CONTACT);
		}
		return pointOfContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDMaintenanceInformationPropertyType> getResourceMaintenance() {
		if (resourceMaintenance == null) {
			resourceMaintenance = new EObjectContainmentEList<MDMaintenanceInformationPropertyType>(MDMaintenanceInformationPropertyType.class, this, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_MAINTENANCE);
		}
		return resourceMaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDBrowseGraphicPropertyType> getGraphicOverview() {
		if (graphicOverview == null) {
			graphicOverview = new EObjectContainmentEList<MDBrowseGraphicPropertyType>(MDBrowseGraphicPropertyType.class, this, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__GRAPHIC_OVERVIEW);
		}
		return graphicOverview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDFormatPropertyType> getResourceFormat() {
		if (resourceFormat == null) {
			resourceFormat = new EObjectContainmentEList<MDFormatPropertyType>(MDFormatPropertyType.class, this, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_FORMAT);
		}
		return resourceFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDKeywordsPropertyType> getDescriptiveKeywords() {
		if (descriptiveKeywords == null) {
			descriptiveKeywords = new EObjectContainmentEList<MDKeywordsPropertyType>(MDKeywordsPropertyType.class, this, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__DESCRIPTIVE_KEYWORDS);
		}
		return descriptiveKeywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDUsagePropertyType> getResourceSpecificUsage() {
		if (resourceSpecificUsage == null) {
			resourceSpecificUsage = new EObjectContainmentEList<MDUsagePropertyType>(MDUsagePropertyType.class, this, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_SPECIFIC_USAGE);
		}
		return resourceSpecificUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDConstraintsPropertyType> getResourceConstraints() {
		if (resourceConstraints == null) {
			resourceConstraints = new EObjectContainmentEList<MDConstraintsPropertyType>(MDConstraintsPropertyType.class, this, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_CONSTRAINTS);
		}
		return resourceConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDAggregateInformationPropertyType> getAggregationInfo() {
		if (aggregationInfo == null) {
			aggregationInfo = new EObjectContainmentEList<MDAggregateInformationPropertyType>(MDAggregateInformationPropertyType.class, this, GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__AGGREGATION_INFO);
		}
		return aggregationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CITATION:
				return basicSetCitation(null, msgs);
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__PURPOSE:
				return basicSetPurpose(null, msgs);
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CREDIT:
				return ((InternalEList<?>)getCredit()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__STATUS:
				return ((InternalEList<?>)getStatus()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__POINT_OF_CONTACT:
				return ((InternalEList<?>)getPointOfContact()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_MAINTENANCE:
				return ((InternalEList<?>)getResourceMaintenance()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__GRAPHIC_OVERVIEW:
				return ((InternalEList<?>)getGraphicOverview()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_FORMAT:
				return ((InternalEList<?>)getResourceFormat()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__DESCRIPTIVE_KEYWORDS:
				return ((InternalEList<?>)getDescriptiveKeywords()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_SPECIFIC_USAGE:
				return ((InternalEList<?>)getResourceSpecificUsage()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_CONSTRAINTS:
				return ((InternalEList<?>)getResourceConstraints()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__AGGREGATION_INFO:
				return ((InternalEList<?>)getAggregationInfo()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CITATION:
				return getCitation();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__ABSTRACT:
				return getAbstract();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__PURPOSE:
				return getPurpose();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CREDIT:
				return getCredit();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__STATUS:
				return getStatus();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__POINT_OF_CONTACT:
				return getPointOfContact();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_MAINTENANCE:
				return getResourceMaintenance();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__GRAPHIC_OVERVIEW:
				return getGraphicOverview();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_FORMAT:
				return getResourceFormat();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__DESCRIPTIVE_KEYWORDS:
				return getDescriptiveKeywords();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_SPECIFIC_USAGE:
				return getResourceSpecificUsage();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_CONSTRAINTS:
				return getResourceConstraints();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__AGGREGATION_INFO:
				return getAggregationInfo();
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
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CITATION:
				setCitation((CICitationPropertyType)newValue);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__ABSTRACT:
				setAbstract((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__PURPOSE:
				setPurpose((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CREDIT:
				getCredit().clear();
				getCredit().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__STATUS:
				getStatus().clear();
				getStatus().addAll((Collection<? extends MDProgressCodePropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__POINT_OF_CONTACT:
				getPointOfContact().clear();
				getPointOfContact().addAll((Collection<? extends CIResponsiblePartyPropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_MAINTENANCE:
				getResourceMaintenance().clear();
				getResourceMaintenance().addAll((Collection<? extends MDMaintenanceInformationPropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__GRAPHIC_OVERVIEW:
				getGraphicOverview().clear();
				getGraphicOverview().addAll((Collection<? extends MDBrowseGraphicPropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_FORMAT:
				getResourceFormat().clear();
				getResourceFormat().addAll((Collection<? extends MDFormatPropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__DESCRIPTIVE_KEYWORDS:
				getDescriptiveKeywords().clear();
				getDescriptiveKeywords().addAll((Collection<? extends MDKeywordsPropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_SPECIFIC_USAGE:
				getResourceSpecificUsage().clear();
				getResourceSpecificUsage().addAll((Collection<? extends MDUsagePropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_CONSTRAINTS:
				getResourceConstraints().clear();
				getResourceConstraints().addAll((Collection<? extends MDConstraintsPropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__AGGREGATION_INFO:
				getAggregationInfo().clear();
				getAggregationInfo().addAll((Collection<? extends MDAggregateInformationPropertyType>)newValue);
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
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CITATION:
				setCitation((CICitationPropertyType)null);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__ABSTRACT:
				setAbstract((CharacterStringPropertyType)null);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__PURPOSE:
				setPurpose((CharacterStringPropertyType)null);
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CREDIT:
				getCredit().clear();
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__STATUS:
				getStatus().clear();
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__POINT_OF_CONTACT:
				getPointOfContact().clear();
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_MAINTENANCE:
				getResourceMaintenance().clear();
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__GRAPHIC_OVERVIEW:
				getGraphicOverview().clear();
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_FORMAT:
				getResourceFormat().clear();
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__DESCRIPTIVE_KEYWORDS:
				getDescriptiveKeywords().clear();
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_SPECIFIC_USAGE:
				getResourceSpecificUsage().clear();
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_CONSTRAINTS:
				getResourceConstraints().clear();
				return;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__AGGREGATION_INFO:
				getAggregationInfo().clear();
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
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CITATION:
				return citation != null;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__ABSTRACT:
				return abstract_ != null;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__PURPOSE:
				return purpose != null;
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__CREDIT:
				return credit != null && !credit.isEmpty();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__STATUS:
				return status != null && !status.isEmpty();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__POINT_OF_CONTACT:
				return pointOfContact != null && !pointOfContact.isEmpty();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_MAINTENANCE:
				return resourceMaintenance != null && !resourceMaintenance.isEmpty();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__GRAPHIC_OVERVIEW:
				return graphicOverview != null && !graphicOverview.isEmpty();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_FORMAT:
				return resourceFormat != null && !resourceFormat.isEmpty();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__DESCRIPTIVE_KEYWORDS:
				return descriptiveKeywords != null && !descriptiveKeywords.isEmpty();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_SPECIFIC_USAGE:
				return resourceSpecificUsage != null && !resourceSpecificUsage.isEmpty();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__RESOURCE_CONSTRAINTS:
				return resourceConstraints != null && !resourceConstraints.isEmpty();
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE__AGGREGATION_INFO:
				return aggregationInfo != null && !aggregationInfo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractMDIdentificationTypeImpl
