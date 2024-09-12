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

import org.isotc211._2005.gco.RecordTypePropertyType;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDCoverageContentTypeCodePropertyType;
import org.isotc211._2005.gmd.MDCoverageDescriptionType;
import org.isotc211._2005.gmd.MDRangeDimensionPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Coverage Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionTypeImpl#getAttributeDescription <em>Attribute Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCoverageDescriptionTypeImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDCoverageDescriptionTypeImpl extends AbstractMDContentInformationTypeImpl implements MDCoverageDescriptionType {
	/**
	 * The cached value of the '{@link #getAttributeDescription() <em>Attribute Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDescription()
	 * @generated
	 * @ordered
	 */
	protected RecordTypePropertyType attributeDescription;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected MDCoverageContentTypeCodePropertyType contentType;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<MDRangeDimensionPropertyType> dimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDCoverageDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDCoverageDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordTypePropertyType getAttributeDescription() {
		return attributeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeDescription(RecordTypePropertyType newAttributeDescription, NotificationChain msgs) {
		RecordTypePropertyType oldAttributeDescription = attributeDescription;
		attributeDescription = newAttributeDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__ATTRIBUTE_DESCRIPTION, oldAttributeDescription, newAttributeDescription);
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
	public void setAttributeDescription(RecordTypePropertyType newAttributeDescription) {
		if (newAttributeDescription != attributeDescription) {
			NotificationChain msgs = null;
			if (attributeDescription != null)
				msgs = ((InternalEObject)attributeDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__ATTRIBUTE_DESCRIPTION, null, msgs);
			if (newAttributeDescription != null)
				msgs = ((InternalEObject)newAttributeDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__ATTRIBUTE_DESCRIPTION, null, msgs);
			msgs = basicSetAttributeDescription(newAttributeDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__ATTRIBUTE_DESCRIPTION, newAttributeDescription, newAttributeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDCoverageContentTypeCodePropertyType getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentType(MDCoverageContentTypeCodePropertyType newContentType, NotificationChain msgs) {
		MDCoverageContentTypeCodePropertyType oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__CONTENT_TYPE, oldContentType, newContentType);
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
	public void setContentType(MDCoverageContentTypeCodePropertyType newContentType) {
		if (newContentType != contentType) {
			NotificationChain msgs = null;
			if (contentType != null)
				msgs = ((InternalEObject)contentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__CONTENT_TYPE, null, msgs);
			if (newContentType != null)
				msgs = ((InternalEObject)newContentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__CONTENT_TYPE, null, msgs);
			msgs = basicSetContentType(newContentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__CONTENT_TYPE, newContentType, newContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDRangeDimensionPropertyType> getDimension() {
		if (dimension == null) {
			dimension = new EObjectContainmentEList<MDRangeDimensionPropertyType>(MDRangeDimensionPropertyType.class, this, GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__DIMENSION);
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__ATTRIBUTE_DESCRIPTION:
				return basicSetAttributeDescription(null, msgs);
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__CONTENT_TYPE:
				return basicSetContentType(null, msgs);
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__DIMENSION:
				return ((InternalEList<?>)getDimension()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__ATTRIBUTE_DESCRIPTION:
				return getAttributeDescription();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__CONTENT_TYPE:
				return getContentType();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__DIMENSION:
				return getDimension();
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
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__ATTRIBUTE_DESCRIPTION:
				setAttributeDescription((RecordTypePropertyType)newValue);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__CONTENT_TYPE:
				setContentType((MDCoverageContentTypeCodePropertyType)newValue);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection<? extends MDRangeDimensionPropertyType>)newValue);
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
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__ATTRIBUTE_DESCRIPTION:
				setAttributeDescription((RecordTypePropertyType)null);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__CONTENT_TYPE:
				setContentType((MDCoverageContentTypeCodePropertyType)null);
				return;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__DIMENSION:
				getDimension().clear();
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
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__ATTRIBUTE_DESCRIPTION:
				return attributeDescription != null;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__CONTENT_TYPE:
				return contentType != null;
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE__DIMENSION:
				return dimension != null && !dimension.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDCoverageDescriptionTypeImpl
