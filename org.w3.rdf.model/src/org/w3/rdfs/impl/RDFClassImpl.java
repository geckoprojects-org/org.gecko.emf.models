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

import org.w3.rdfs.RDFClass;
import org.w3.rdfs.RdfsPackage;
import org.w3.rdfs.SubClassOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDF Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.impl.RDFClassImpl#getSubClassOf <em>Sub Class Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDFClassImpl extends RDFResourceImpl implements RDFClass {
	/**
	 * The cached value of the '{@link #getSubClassOf() <em>Sub Class Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassOf()
	 * @generated
	 * @ordered
	 */
	protected SubClassOf subClassOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDFClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfsPackage.Literals.RDF_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubClassOf getSubClassOf() {
		if (subClassOf != null && subClassOf.eIsProxy()) {
			InternalEObject oldSubClassOf = (InternalEObject)subClassOf;
			subClassOf = (SubClassOf)eResolveProxy(oldSubClassOf);
			if (subClassOf != oldSubClassOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfsPackage.RDF_CLASS__SUB_CLASS_OF, oldSubClassOf, subClassOf));
			}
		}
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubClassOf basicGetSubClassOf() {
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubClassOf(SubClassOf newSubClassOf, NotificationChain msgs) {
		SubClassOf oldSubClassOf = subClassOf;
		subClassOf = newSubClassOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdfsPackage.RDF_CLASS__SUB_CLASS_OF, oldSubClassOf, newSubClassOf);
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
	public void setSubClassOf(SubClassOf newSubClassOf) {
		if (newSubClassOf != subClassOf) {
			NotificationChain msgs = null;
			if (subClassOf != null)
				msgs = ((InternalEObject)subClassOf).eInverseRemove(this, RdfsPackage.SUB_CLASS_OF__RDF_CLASS, SubClassOf.class, msgs);
			if (newSubClassOf != null)
				msgs = ((InternalEObject)newSubClassOf).eInverseAdd(this, RdfsPackage.SUB_CLASS_OF__RDF_CLASS, SubClassOf.class, msgs);
			msgs = basicSetSubClassOf(newSubClassOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.RDF_CLASS__SUB_CLASS_OF, newSubClassOf, newSubClassOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfsPackage.RDF_CLASS__SUB_CLASS_OF:
				if (subClassOf != null)
					msgs = ((InternalEObject)subClassOf).eInverseRemove(this, RdfsPackage.SUB_CLASS_OF__RDF_CLASS, SubClassOf.class, msgs);
				return basicSetSubClassOf((SubClassOf)otherEnd, msgs);
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
			case RdfsPackage.RDF_CLASS__SUB_CLASS_OF:
				return basicSetSubClassOf(null, msgs);
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
			case RdfsPackage.RDF_CLASS__SUB_CLASS_OF:
				if (resolve) return getSubClassOf();
				return basicGetSubClassOf();
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
			case RdfsPackage.RDF_CLASS__SUB_CLASS_OF:
				setSubClassOf((SubClassOf)newValue);
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
			case RdfsPackage.RDF_CLASS__SUB_CLASS_OF:
				setSubClassOf((SubClassOf)null);
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
			case RdfsPackage.RDF_CLASS__SUB_CLASS_OF:
				return subClassOf != null;
		}
		return super.eIsSet(featureID);
	}

} //RDFClassImpl
