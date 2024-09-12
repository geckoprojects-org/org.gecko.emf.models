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

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CIOnlineResourcePropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDExtendedElementInformationPropertyType;
import org.isotc211._2005.gmd.MDMetadataExtensionInformationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Metadata Extension Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataExtensionInformationTypeImpl#getExtensionOnLineResource <em>Extension On Line Resource</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMetadataExtensionInformationTypeImpl#getExtendedElementInformation <em>Extended Element Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDMetadataExtensionInformationTypeImpl extends AbstractObjectTypeImpl implements MDMetadataExtensionInformationType {
	/**
	 * The cached value of the '{@link #getExtensionOnLineResource() <em>Extension On Line Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionOnLineResource()
	 * @generated
	 * @ordered
	 */
	protected CIOnlineResourcePropertyType extensionOnLineResource;

	/**
	 * The cached value of the '{@link #getExtendedElementInformation() <em>Extended Element Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedElementInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<MDExtendedElementInformationPropertyType> extendedElementInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDMetadataExtensionInformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDMetadataExtensionInformationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIOnlineResourcePropertyType getExtensionOnLineResource() {
		return extensionOnLineResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionOnLineResource(CIOnlineResourcePropertyType newExtensionOnLineResource, NotificationChain msgs) {
		CIOnlineResourcePropertyType oldExtensionOnLineResource = extensionOnLineResource;
		extensionOnLineResource = newExtensionOnLineResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENSION_ON_LINE_RESOURCE, oldExtensionOnLineResource, newExtensionOnLineResource);
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
	public void setExtensionOnLineResource(CIOnlineResourcePropertyType newExtensionOnLineResource) {
		if (newExtensionOnLineResource != extensionOnLineResource) {
			NotificationChain msgs = null;
			if (extensionOnLineResource != null)
				msgs = ((InternalEObject)extensionOnLineResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENSION_ON_LINE_RESOURCE, null, msgs);
			if (newExtensionOnLineResource != null)
				msgs = ((InternalEObject)newExtensionOnLineResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENSION_ON_LINE_RESOURCE, null, msgs);
			msgs = basicSetExtensionOnLineResource(newExtensionOnLineResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENSION_ON_LINE_RESOURCE, newExtensionOnLineResource, newExtensionOnLineResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDExtendedElementInformationPropertyType> getExtendedElementInformation() {
		if (extendedElementInformation == null) {
			extendedElementInformation = new EObjectContainmentEList<MDExtendedElementInformationPropertyType>(MDExtendedElementInformationPropertyType.class, this, GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENDED_ELEMENT_INFORMATION);
		}
		return extendedElementInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENSION_ON_LINE_RESOURCE:
				return basicSetExtensionOnLineResource(null, msgs);
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENDED_ELEMENT_INFORMATION:
				return ((InternalEList<?>)getExtendedElementInformation()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENSION_ON_LINE_RESOURCE:
				return getExtensionOnLineResource();
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENDED_ELEMENT_INFORMATION:
				return getExtendedElementInformation();
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
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENSION_ON_LINE_RESOURCE:
				setExtensionOnLineResource((CIOnlineResourcePropertyType)newValue);
				return;
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENDED_ELEMENT_INFORMATION:
				getExtendedElementInformation().clear();
				getExtendedElementInformation().addAll((Collection<? extends MDExtendedElementInformationPropertyType>)newValue);
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
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENSION_ON_LINE_RESOURCE:
				setExtensionOnLineResource((CIOnlineResourcePropertyType)null);
				return;
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENDED_ELEMENT_INFORMATION:
				getExtendedElementInformation().clear();
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
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENSION_ON_LINE_RESOURCE:
				return extensionOnLineResource != null;
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE__EXTENDED_ELEMENT_INFORMATION:
				return extendedElementInformation != null && !extendedElementInformation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDMetadataExtensionInformationTypeImpl
