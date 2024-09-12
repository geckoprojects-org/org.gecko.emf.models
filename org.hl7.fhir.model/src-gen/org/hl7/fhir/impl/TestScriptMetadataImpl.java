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

import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.TestScriptCapability;
import org.hl7.fhir.TestScriptLink;
import org.hl7.fhir.TestScriptMetadata;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestScriptMetadataImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptMetadataImpl#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptMetadataImpl extends BackboneElementImpl implements TestScriptMetadata {
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptLink> link;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptCapability> capability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getTestScriptMetadata();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestScriptLink> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<TestScriptLink>(TestScriptLink.class, this, FHIRPackage.TEST_SCRIPT_METADATA__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestScriptCapability> getCapability() {
		if (capability == null) {
			capability = new EObjectContainmentEList<TestScriptCapability>(TestScriptCapability.class, this, FHIRPackage.TEST_SCRIPT_METADATA__CAPABILITY);
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.TEST_SCRIPT_METADATA__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case FHIRPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				return ((InternalEList<?>)getCapability()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.TEST_SCRIPT_METADATA__LINK:
				return getLink();
			case FHIRPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				return getCapability();
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
			case FHIRPackage.TEST_SCRIPT_METADATA__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends TestScriptLink>)newValue);
				return;
			case FHIRPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				getCapability().clear();
				getCapability().addAll((Collection<? extends TestScriptCapability>)newValue);
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
			case FHIRPackage.TEST_SCRIPT_METADATA__LINK:
				getLink().clear();
				return;
			case FHIRPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				getCapability().clear();
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
			case FHIRPackage.TEST_SCRIPT_METADATA__LINK:
				return link != null && !link.isEmpty();
			case FHIRPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				return capability != null && !capability.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestScriptMetadataImpl
