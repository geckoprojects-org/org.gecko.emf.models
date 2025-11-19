/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.open.oasis.docs.odata.ns.edm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.odata.ns.edm.AnnotationType;
import org.open.oasis.docs.odata.ns.edm.EdmPackage;
import org.open.oasis.docs.odata.ns.edm.TReferentialConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TReferential Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TReferentialConstraintImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TReferentialConstraintImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TReferentialConstraintImpl#getReferencedProperty <em>Referenced Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TReferentialConstraintImpl extends MinimalEObjectImpl.Container implements TReferentialConstraint {
	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationType> annotation;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected String property = PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferencedProperty() <em>Referenced Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedProperty() <em>Referenced Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedProperty()
	 * @generated
	 * @ordered
	 */
	protected String referencedProperty = REFERENCED_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TReferentialConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTReferentialConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<AnnotationType>(AnnotationType.class, this, EdmPackage.TREFERENTIAL_CONSTRAINT__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(String newProperty) {
		String oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TREFERENTIAL_CONSTRAINT__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferencedProperty() {
		return referencedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedProperty(String newReferencedProperty) {
		String oldReferencedProperty = referencedProperty;
		referencedProperty = newReferencedProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TREFERENTIAL_CONSTRAINT__REFERENCED_PROPERTY, oldReferencedProperty, referencedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TREFERENTIAL_CONSTRAINT__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.TREFERENTIAL_CONSTRAINT__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TREFERENTIAL_CONSTRAINT__PROPERTY:
				return getProperty();
			case EdmPackage.TREFERENTIAL_CONSTRAINT__REFERENCED_PROPERTY:
				return getReferencedProperty();
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
			case EdmPackage.TREFERENTIAL_CONSTRAINT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TREFERENTIAL_CONSTRAINT__PROPERTY:
				setProperty((String)newValue);
				return;
			case EdmPackage.TREFERENTIAL_CONSTRAINT__REFERENCED_PROPERTY:
				setReferencedProperty((String)newValue);
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
			case EdmPackage.TREFERENTIAL_CONSTRAINT__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TREFERENTIAL_CONSTRAINT__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case EdmPackage.TREFERENTIAL_CONSTRAINT__REFERENCED_PROPERTY:
				setReferencedProperty(REFERENCED_PROPERTY_EDEFAULT);
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
			case EdmPackage.TREFERENTIAL_CONSTRAINT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EdmPackage.TREFERENTIAL_CONSTRAINT__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
			case EdmPackage.TREFERENTIAL_CONSTRAINT__REFERENCED_PROPERTY:
				return REFERENCED_PROPERTY_EDEFAULT == null ? referencedProperty != null : !REFERENCED_PROPERTY_EDEFAULT.equals(referencedProperty);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (property: ");
		result.append(property);
		result.append(", referencedProperty: ");
		result.append(referencedProperty);
		result.append(')');
		return result.toString();
	}

} //TReferentialConstraintImpl
