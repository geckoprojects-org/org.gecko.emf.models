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
package org.w3.owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3.owl.Datatype;
import org.w3.owl.NegativePropertyAssertion;
import org.w3.owl.OwlPackage;
import org.w3.owl.Thing;

import org.w3.rdf.RDFProperty;

import org.w3.rdfs.impl.RDFResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negative Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.impl.NegativePropertyAssertionImpl#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link org.w3.owl.impl.NegativePropertyAssertionImpl#getTargetIndividual <em>Target Individual</em>}</li>
 *   <li>{@link org.w3.owl.impl.NegativePropertyAssertionImpl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link org.w3.owl.impl.NegativePropertyAssertionImpl#getAssertionProperty <em>Assertion Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NegativePropertyAssertionImpl extends RDFResourceImpl implements NegativePropertyAssertion {
	/**
	 * The cached value of the '{@link #getSourceIndividual() <em>Source Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIndividual()
	 * @generated
	 * @ordered
	 */
	protected Thing sourceIndividual;

	/**
	 * The cached value of the '{@link #getTargetIndividual() <em>Target Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIndividual()
	 * @generated
	 * @ordered
	 */
	protected Thing targetIndividual;

	/**
	 * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected Datatype targetValue;

	/**
	 * The cached value of the '{@link #getAssertionProperty() <em>Assertion Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertionProperty()
	 * @generated
	 * @ordered
	 */
	protected RDFProperty assertionProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegativePropertyAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.NEGATIVE_PROPERTY_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Thing getSourceIndividual() {
		if (sourceIndividual != null && sourceIndividual.eIsProxy()) {
			InternalEObject oldSourceIndividual = (InternalEObject)sourceIndividual;
			sourceIndividual = (Thing)eResolveProxy(oldSourceIndividual);
			if (sourceIndividual != oldSourceIndividual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.NEGATIVE_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, oldSourceIndividual, sourceIndividual));
			}
		}
		return sourceIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing basicGetSourceIndividual() {
		return sourceIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceIndividual(Thing newSourceIndividual) {
		Thing oldSourceIndividual = sourceIndividual;
		sourceIndividual = newSourceIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.NEGATIVE_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, oldSourceIndividual, sourceIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Thing getTargetIndividual() {
		if (targetIndividual != null && targetIndividual.eIsProxy()) {
			InternalEObject oldTargetIndividual = (InternalEObject)targetIndividual;
			targetIndividual = (Thing)eResolveProxy(oldTargetIndividual);
			if (targetIndividual != oldTargetIndividual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.NEGATIVE_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, oldTargetIndividual, targetIndividual));
			}
		}
		return targetIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing basicGetTargetIndividual() {
		return targetIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetIndividual(Thing newTargetIndividual) {
		Thing oldTargetIndividual = targetIndividual;
		targetIndividual = newTargetIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.NEGATIVE_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, oldTargetIndividual, targetIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datatype getTargetValue() {
		if (targetValue != null && targetValue.eIsProxy()) {
			InternalEObject oldTargetValue = (InternalEObject)targetValue;
			targetValue = (Datatype)eResolveProxy(oldTargetValue);
			if (targetValue != oldTargetValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.NEGATIVE_PROPERTY_ASSERTION__TARGET_VALUE, oldTargetValue, targetValue));
			}
		}
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype basicGetTargetValue() {
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetValue(Datatype newTargetValue) {
		Datatype oldTargetValue = targetValue;
		targetValue = newTargetValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.NEGATIVE_PROPERTY_ASSERTION__TARGET_VALUE, oldTargetValue, targetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFProperty getAssertionProperty() {
		if (assertionProperty != null && assertionProperty.eIsProxy()) {
			InternalEObject oldAssertionProperty = (InternalEObject)assertionProperty;
			assertionProperty = (RDFProperty)eResolveProxy(oldAssertionProperty);
			if (assertionProperty != oldAssertionProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.NEGATIVE_PROPERTY_ASSERTION__ASSERTION_PROPERTY, oldAssertionProperty, assertionProperty));
			}
		}
		return assertionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFProperty basicGetAssertionProperty() {
		return assertionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssertionProperty(RDFProperty newAssertionProperty) {
		RDFProperty oldAssertionProperty = assertionProperty;
		assertionProperty = newAssertionProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.NEGATIVE_PROPERTY_ASSERTION__ASSERTION_PROPERTY, oldAssertionProperty, assertionProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				if (resolve) return getSourceIndividual();
				return basicGetSourceIndividual();
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				if (resolve) return getTargetIndividual();
				return basicGetTargetIndividual();
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__TARGET_VALUE:
				if (resolve) return getTargetValue();
				return basicGetTargetValue();
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__ASSERTION_PROPERTY:
				if (resolve) return getAssertionProperty();
				return basicGetAssertionProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				setSourceIndividual((Thing)newValue);
				return;
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				setTargetIndividual((Thing)newValue);
				return;
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__TARGET_VALUE:
				setTargetValue((Datatype)newValue);
				return;
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__ASSERTION_PROPERTY:
				setAssertionProperty((RDFProperty)newValue);
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
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				setSourceIndividual((Thing)null);
				return;
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				setTargetIndividual((Thing)null);
				return;
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__TARGET_VALUE:
				setTargetValue((Datatype)null);
				return;
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__ASSERTION_PROPERTY:
				setAssertionProperty((RDFProperty)null);
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
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				return sourceIndividual != null;
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				return targetIndividual != null;
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__TARGET_VALUE:
				return targetValue != null;
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION__ASSERTION_PROPERTY:
				return assertionProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //NegativePropertyAssertionImpl
