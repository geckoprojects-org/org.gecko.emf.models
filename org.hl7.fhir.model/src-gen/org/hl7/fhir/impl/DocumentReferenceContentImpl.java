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
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.DocumentReferenceProfile;
import org.hl7.fhir.FHIRPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Reference Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceContentImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceContentImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentReferenceContentImpl extends BackboneElementImpl implements DocumentReferenceContent {
	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachment;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentReferenceProfile> profile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentReferenceContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getDocumentReferenceContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getAttachment() {
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment(Attachment newAttachment, NotificationChain msgs) {
		Attachment oldAttachment = attachment;
		attachment = newAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT, oldAttachment, newAttachment);
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
	public void setAttachment(Attachment newAttachment) {
		if (newAttachment != attachment) {
			NotificationChain msgs = null;
			if (attachment != null)
				msgs = ((InternalEObject)attachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT, null, msgs);
			if (newAttachment != null)
				msgs = ((InternalEObject)newAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT, null, msgs);
			msgs = basicSetAttachment(newAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT, newAttachment, newAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentReferenceProfile> getProfile() {
		if (profile == null) {
			profile = new EObjectContainmentEList<DocumentReferenceProfile>(DocumentReferenceProfile.class, this, FHIRPackage.DOCUMENT_REFERENCE_CONTENT__PROFILE);
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				return basicSetAttachment(null, msgs);
			case FHIRPackage.DOCUMENT_REFERENCE_CONTENT__PROFILE:
				return ((InternalEList<?>)getProfile()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				return getAttachment();
			case FHIRPackage.DOCUMENT_REFERENCE_CONTENT__PROFILE:
				return getProfile();
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
			case FHIRPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				setAttachment((Attachment)newValue);
				return;
			case FHIRPackage.DOCUMENT_REFERENCE_CONTENT__PROFILE:
				getProfile().clear();
				getProfile().addAll((Collection<? extends DocumentReferenceProfile>)newValue);
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
			case FHIRPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				setAttachment((Attachment)null);
				return;
			case FHIRPackage.DOCUMENT_REFERENCE_CONTENT__PROFILE:
				getProfile().clear();
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
			case FHIRPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				return attachment != null;
			case FHIRPackage.DOCUMENT_REFERENCE_CONTENT__PROFILE:
				return profile != null && !profile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentReferenceContentImpl
