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
package org.w3.rdfs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.rdf.RDFProperty;
import org.w3.rdf.RdfPackage;

import org.w3.rdfs.RdfsPackage;
import org.w3.rdfs.SubPropertyOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Property Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.impl.SubPropertyOfImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.w3.rdfs.impl.SubPropertyOfImpl#getSubPropertyOf <em>Sub Property Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubPropertyOfImpl extends MinimalEObjectImpl.Container implements SubPropertyOf {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected RDFProperty property;

	/**
	 * The cached value of the '{@link #getSubPropertyOf() <em>Sub Property Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected RDFProperty subPropertyOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubPropertyOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfsPackage.Literals.SUB_PROPERTY_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFProperty getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (RDFProperty)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfsPackage.SUB_PROPERTY_OF__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFProperty basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(RDFProperty newProperty, NotificationChain msgs) {
		RDFProperty oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdfsPackage.SUB_PROPERTY_OF__PROPERTY, oldProperty, newProperty);
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
	public void setProperty(RDFProperty newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF, RDFProperty.class, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF, RDFProperty.class, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.SUB_PROPERTY_OF__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFProperty getSubPropertyOf() {
		if (subPropertyOf != null && subPropertyOf.eIsProxy()) {
			InternalEObject oldSubPropertyOf = (InternalEObject)subPropertyOf;
			subPropertyOf = (RDFProperty)eResolveProxy(oldSubPropertyOf);
			if (subPropertyOf != oldSubPropertyOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfsPackage.SUB_PROPERTY_OF__SUB_PROPERTY_OF, oldSubPropertyOf, subPropertyOf));
			}
		}
		return subPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFProperty basicGetSubPropertyOf() {
		return subPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubPropertyOf(RDFProperty newSubPropertyOf) {
		RDFProperty oldSubPropertyOf = subPropertyOf;
		subPropertyOf = newSubPropertyOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.SUB_PROPERTY_OF__SUB_PROPERTY_OF, oldSubPropertyOf, subPropertyOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfsPackage.SUB_PROPERTY_OF__PROPERTY:
				if (property != null)
					msgs = ((InternalEObject)property).eInverseRemove(this, RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF, RDFProperty.class, msgs);
				return basicSetProperty((RDFProperty)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfsPackage.SUB_PROPERTY_OF__PROPERTY:
				return basicSetProperty(null, msgs);
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
			case RdfsPackage.SUB_PROPERTY_OF__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case RdfsPackage.SUB_PROPERTY_OF__SUB_PROPERTY_OF:
				if (resolve) return getSubPropertyOf();
				return basicGetSubPropertyOf();
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
			case RdfsPackage.SUB_PROPERTY_OF__PROPERTY:
				setProperty((RDFProperty)newValue);
				return;
			case RdfsPackage.SUB_PROPERTY_OF__SUB_PROPERTY_OF:
				setSubPropertyOf((RDFProperty)newValue);
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
			case RdfsPackage.SUB_PROPERTY_OF__PROPERTY:
				setProperty((RDFProperty)null);
				return;
			case RdfsPackage.SUB_PROPERTY_OF__SUB_PROPERTY_OF:
				setSubPropertyOf((RDFProperty)null);
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
			case RdfsPackage.SUB_PROPERTY_OF__PROPERTY:
				return property != null;
			case RdfsPackage.SUB_PROPERTY_OF__SUB_PROPERTY_OF:
				return subPropertyOf != null;
		}
		return super.eIsSet(featureID);
	}

} //SubPropertyOfImpl
