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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.EndpointPayload;
import org.hl7.fhir.FHIRPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint Payload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EndpointPayloadImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointPayloadImpl#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointPayloadImpl extends BackboneElementImpl implements EndpointPayload {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> mimeType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointPayloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getEndpointPayload();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.ENDPOINT_PAYLOAD__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getMimeType() {
		if (mimeType == null) {
			mimeType = new EObjectContainmentEList<Code>(Code.class, this, FHIRPackage.ENDPOINT_PAYLOAD__MIME_TYPE);
		}
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.ENDPOINT_PAYLOAD__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ENDPOINT_PAYLOAD__MIME_TYPE:
				return ((InternalEList<?>)getMimeType()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.ENDPOINT_PAYLOAD__TYPE:
				return getType();
			case FHIRPackage.ENDPOINT_PAYLOAD__MIME_TYPE:
				return getMimeType();
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
			case FHIRPackage.ENDPOINT_PAYLOAD__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.ENDPOINT_PAYLOAD__MIME_TYPE:
				getMimeType().clear();
				getMimeType().addAll((Collection<? extends Code>)newValue);
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
			case FHIRPackage.ENDPOINT_PAYLOAD__TYPE:
				getType().clear();
				return;
			case FHIRPackage.ENDPOINT_PAYLOAD__MIME_TYPE:
				getMimeType().clear();
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
			case FHIRPackage.ENDPOINT_PAYLOAD__TYPE:
				return type != null && !type.isEmpty();
			case FHIRPackage.ENDPOINT_PAYLOAD__MIME_TYPE:
				return mimeType != null && !mimeType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EndpointPayloadImpl
