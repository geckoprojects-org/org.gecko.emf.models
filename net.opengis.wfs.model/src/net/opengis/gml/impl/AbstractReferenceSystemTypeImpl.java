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
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.AbstractReferenceSystemType;
import net.opengis.gml.ExtentType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.IdentifierType;
import net.opengis.gml.StringOrRefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.AbstractReferenceSystemTypeImpl#getSrsID <em>Srs ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractReferenceSystemTypeImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractReferenceSystemTypeImpl#getValidArea <em>Valid Area</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractReferenceSystemTypeImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractReferenceSystemTypeImpl extends AbstractReferenceSystemBaseTypeImpl implements AbstractReferenceSystemType {
	/**
	 * The cached value of the '{@link #getSrsID() <em>Srs ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsID()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierType> srsID;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType remarks;

	/**
	 * The cached value of the '{@link #getValidArea() <em>Valid Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidArea()
	 * @generated
	 * @ordered
	 */
	protected ExtentType validArea;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractReferenceSystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractReferenceSystemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdentifierType> getSrsID() {
		if (srsID == null) {
			srsID = new EObjectContainmentEList<IdentifierType>(IdentifierType.class, this, GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__SRS_ID);
		}
		return srsID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemarks(StringOrRefType newRemarks, NotificationChain msgs) {
		StringOrRefType oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__REMARKS, oldRemarks, newRemarks);
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
	public void setRemarks(StringOrRefType newRemarks) {
		if (newRemarks != remarks) {
			NotificationChain msgs = null;
			if (remarks != null)
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtentType getValidArea() {
		return validArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidArea(ExtentType newValidArea, NotificationChain msgs) {
		ExtentType oldValidArea = validArea;
		validArea = newValidArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__VALID_AREA, oldValidArea, newValidArea);
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
	public void setValidArea(ExtentType newValidArea) {
		if (newValidArea != validArea) {
			NotificationChain msgs = null;
			if (validArea != null)
				msgs = ((InternalEObject)validArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__VALID_AREA, null, msgs);
			if (newValidArea != null)
				msgs = ((InternalEObject)newValidArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__VALID_AREA, null, msgs);
			msgs = basicSetValidArea(newValidArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__VALID_AREA, newValidArea, newValidArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__SRS_ID:
				return ((InternalEList<?>)getSrsID()).basicRemove(otherEnd, msgs);
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__REMARKS:
				return basicSetRemarks(null, msgs);
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__VALID_AREA:
				return basicSetValidArea(null, msgs);
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
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__SRS_ID:
				return getSrsID();
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__REMARKS:
				return getRemarks();
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__VALID_AREA:
				return getValidArea();
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__SCOPE:
				return getScope();
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
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__SRS_ID:
				getSrsID().clear();
				getSrsID().addAll((Collection<? extends IdentifierType>)newValue);
				return;
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__REMARKS:
				setRemarks((StringOrRefType)newValue);
				return;
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__VALID_AREA:
				setValidArea((ExtentType)newValue);
				return;
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__SCOPE:
				setScope((String)newValue);
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
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__SRS_ID:
				getSrsID().clear();
				return;
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__REMARKS:
				setRemarks((StringOrRefType)null);
				return;
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__VALID_AREA:
				setValidArea((ExtentType)null);
				return;
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__SCOPE:
				setScope(SCOPE_EDEFAULT);
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
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__SRS_ID:
				return srsID != null && !srsID.isEmpty();
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__REMARKS:
				return remarks != null;
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__VALID_AREA:
				return validArea != null;
			case GMLPackage.ABSTRACT_REFERENCE_SYSTEM_TYPE__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
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
		result.append(" (scope: ");
		result.append(scope);
		result.append(')');
		return result.toString();
	}

} //AbstractReferenceSystemTypeImpl
