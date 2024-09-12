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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.CodeType;
import net.opengis.gml.gml.CompassPointEnumeration;
import net.opengis.gml.gml.DirectionDescriptionType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.ReferenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direction Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.DirectionDescriptionTypeImpl#getCompassPoint <em>Compass Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.DirectionDescriptionTypeImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.DirectionDescriptionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.DirectionDescriptionTypeImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectionDescriptionTypeImpl extends MinimalEObjectImpl.Container implements DirectionDescriptionType {
	/**
	 * The default value of the '{@link #getCompassPoint() <em>Compass Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompassPoint()
	 * @generated
	 * @ordered
	 */
	protected static final CompassPointEnumeration COMPASS_POINT_EDEFAULT = CompassPointEnumeration.N;

	/**
	 * The cached value of the '{@link #getCompassPoint() <em>Compass Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompassPoint()
	 * @generated
	 * @ordered
	 */
	protected CompassPointEnumeration compassPoint = COMPASS_POINT_EDEFAULT;

	/**
	 * This is true if the Compass Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compassPointESet;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected CodeType keyword;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectionDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getDirectionDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompassPointEnumeration getCompassPoint() {
		return compassPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompassPoint(CompassPointEnumeration newCompassPoint) {
		CompassPointEnumeration oldCompassPoint = compassPoint;
		compassPoint = newCompassPoint == null ? COMPASS_POINT_EDEFAULT : newCompassPoint;
		boolean oldCompassPointESet = compassPointESet;
		compassPointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECTION_DESCRIPTION_TYPE__COMPASS_POINT, oldCompassPoint, compassPoint, !oldCompassPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCompassPoint() {
		CompassPointEnumeration oldCompassPoint = compassPoint;
		boolean oldCompassPointESet = compassPointESet;
		compassPoint = COMPASS_POINT_EDEFAULT;
		compassPointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.DIRECTION_DESCRIPTION_TYPE__COMPASS_POINT, oldCompassPoint, COMPASS_POINT_EDEFAULT, oldCompassPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCompassPoint() {
		return compassPointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyword(CodeType newKeyword, NotificationChain msgs) {
		CodeType oldKeyword = keyword;
		keyword = newKeyword;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECTION_DESCRIPTION_TYPE__KEYWORD, oldKeyword, newKeyword);
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
	public void setKeyword(CodeType newKeyword) {
		if (newKeyword != keyword) {
			NotificationChain msgs = null;
			if (keyword != null)
				msgs = ((InternalEObject)keyword).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DIRECTION_DESCRIPTION_TYPE__KEYWORD, null, msgs);
			if (newKeyword != null)
				msgs = ((InternalEObject)newKeyword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DIRECTION_DESCRIPTION_TYPE__KEYWORD, null, msgs);
			msgs = basicSetKeyword(newKeyword, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECTION_DESCRIPTION_TYPE__KEYWORD, newKeyword, newKeyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECTION_DESCRIPTION_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(ReferenceType newReference, NotificationChain msgs) {
		ReferenceType oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECTION_DESCRIPTION_TYPE__REFERENCE, oldReference, newReference);
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
	public void setReference(ReferenceType newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DIRECTION_DESCRIPTION_TYPE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DIRECTION_DESCRIPTION_TYPE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECTION_DESCRIPTION_TYPE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__KEYWORD:
				return basicSetKeyword(null, msgs);
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__REFERENCE:
				return basicSetReference(null, msgs);
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
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__COMPASS_POINT:
				return getCompassPoint();
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__KEYWORD:
				return getKeyword();
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__DESCRIPTION:
				return getDescription();
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__REFERENCE:
				return getReference();
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
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__COMPASS_POINT:
				setCompassPoint((CompassPointEnumeration)newValue);
				return;
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__KEYWORD:
				setKeyword((CodeType)newValue);
				return;
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__REFERENCE:
				setReference((ReferenceType)newValue);
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
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__COMPASS_POINT:
				unsetCompassPoint();
				return;
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__KEYWORD:
				setKeyword((CodeType)null);
				return;
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__REFERENCE:
				setReference((ReferenceType)null);
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
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__COMPASS_POINT:
				return isSetCompassPoint();
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__KEYWORD:
				return keyword != null;
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE__REFERENCE:
				return reference != null;
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
		result.append(" (compassPoint: ");
		if (compassPointESet) result.append(compassPoint); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DirectionDescriptionTypeImpl
