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

import org.w3.rdfs.RDFClass;
import org.w3.rdfs.RdfsPackage;
import org.w3.rdfs.SubClassOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Class Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.impl.SubClassOfImpl#getRdfClass <em>Rdf Class</em>}</li>
 *   <li>{@link org.w3.rdfs.impl.SubClassOfImpl#getSubClassOf <em>Sub Class Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubClassOfImpl extends MinimalEObjectImpl.Container implements SubClassOf {
	/**
	 * The cached value of the '{@link #getRdfClass() <em>Rdf Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfClass()
	 * @generated
	 * @ordered
	 */
	protected RDFClass rdfClass;

	/**
	 * The cached value of the '{@link #getSubClassOf() <em>Sub Class Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassOf()
	 * @generated
	 * @ordered
	 */
	protected RDFClass subClassOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubClassOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfsPackage.Literals.SUB_CLASS_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFClass getRdfClass() {
		if (rdfClass != null && rdfClass.eIsProxy()) {
			InternalEObject oldRdfClass = (InternalEObject)rdfClass;
			rdfClass = (RDFClass)eResolveProxy(oldRdfClass);
			if (rdfClass != oldRdfClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfsPackage.SUB_CLASS_OF__RDF_CLASS, oldRdfClass, rdfClass));
			}
		}
		return rdfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFClass basicGetRdfClass() {
		return rdfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfClass(RDFClass newRdfClass, NotificationChain msgs) {
		RDFClass oldRdfClass = rdfClass;
		rdfClass = newRdfClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdfsPackage.SUB_CLASS_OF__RDF_CLASS, oldRdfClass, newRdfClass);
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
	public void setRdfClass(RDFClass newRdfClass) {
		if (newRdfClass != rdfClass) {
			NotificationChain msgs = null;
			if (rdfClass != null)
				msgs = ((InternalEObject)rdfClass).eInverseRemove(this, RdfsPackage.RDF_CLASS__SUB_CLASS_OF, RDFClass.class, msgs);
			if (newRdfClass != null)
				msgs = ((InternalEObject)newRdfClass).eInverseAdd(this, RdfsPackage.RDF_CLASS__SUB_CLASS_OF, RDFClass.class, msgs);
			msgs = basicSetRdfClass(newRdfClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.SUB_CLASS_OF__RDF_CLASS, newRdfClass, newRdfClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFClass getSubClassOf() {
		if (subClassOf != null && subClassOf.eIsProxy()) {
			InternalEObject oldSubClassOf = (InternalEObject)subClassOf;
			subClassOf = (RDFClass)eResolveProxy(oldSubClassOf);
			if (subClassOf != oldSubClassOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfsPackage.SUB_CLASS_OF__SUB_CLASS_OF, oldSubClassOf, subClassOf));
			}
		}
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFClass basicGetSubClassOf() {
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubClassOf(RDFClass newSubClassOf) {
		RDFClass oldSubClassOf = subClassOf;
		subClassOf = newSubClassOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.SUB_CLASS_OF__SUB_CLASS_OF, oldSubClassOf, subClassOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfsPackage.SUB_CLASS_OF__RDF_CLASS:
				if (rdfClass != null)
					msgs = ((InternalEObject)rdfClass).eInverseRemove(this, RdfsPackage.RDF_CLASS__SUB_CLASS_OF, RDFClass.class, msgs);
				return basicSetRdfClass((RDFClass)otherEnd, msgs);
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
			case RdfsPackage.SUB_CLASS_OF__RDF_CLASS:
				return basicSetRdfClass(null, msgs);
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
			case RdfsPackage.SUB_CLASS_OF__RDF_CLASS:
				if (resolve) return getRdfClass();
				return basicGetRdfClass();
			case RdfsPackage.SUB_CLASS_OF__SUB_CLASS_OF:
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
			case RdfsPackage.SUB_CLASS_OF__RDF_CLASS:
				setRdfClass((RDFClass)newValue);
				return;
			case RdfsPackage.SUB_CLASS_OF__SUB_CLASS_OF:
				setSubClassOf((RDFClass)newValue);
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
			case RdfsPackage.SUB_CLASS_OF__RDF_CLASS:
				setRdfClass((RDFClass)null);
				return;
			case RdfsPackage.SUB_CLASS_OF__SUB_CLASS_OF:
				setSubClassOf((RDFClass)null);
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
			case RdfsPackage.SUB_CLASS_OF__RDF_CLASS:
				return rdfClass != null;
			case RdfsPackage.SUB_CLASS_OF__SUB_CLASS_OF:
				return subClassOf != null;
		}
		return super.eIsSet(featureID);
	}

} //SubClassOfImpl
