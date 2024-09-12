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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.NamingSystemIdentifierType;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Naming System Unique Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemUniqueIdImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemUniqueIdImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemUniqueIdImpl#getPreferred <em>Preferred</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemUniqueIdImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemUniqueIdImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemUniqueIdImpl#getAuthoritative <em>Authoritative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamingSystemUniqueIdImpl extends BackboneElementImpl implements NamingSystemUniqueId {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NamingSystemIdentifierType type;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String value;

	/**
	 * The cached value of the '{@link #getPreferred() <em>Preferred</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferred()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean preferred;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getAuthoritative() <em>Authoritative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoritative()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean authoritative;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamingSystemUniqueIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getNamingSystemUniqueId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingSystemIdentifierType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(NamingSystemIdentifierType newType, NotificationChain msgs) {
		NamingSystemIdentifierType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE, oldType, newType);
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
	public void setType(NamingSystemIdentifierType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(org.hl7.fhir.String newValue, NotificationChain msgs) {
		org.hl7.fhir.String oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE, oldValue, newValue);
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
	public void setValue(org.hl7.fhir.String newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getPreferred() {
		return preferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferred(org.hl7.fhir.Boolean newPreferred, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldPreferred = preferred;
		preferred = newPreferred;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED, oldPreferred, newPreferred);
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
	public void setPreferred(org.hl7.fhir.Boolean newPreferred) {
		if (newPreferred != preferred) {
			NotificationChain msgs = null;
			if (preferred != null)
				msgs = ((InternalEObject)preferred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED, null, msgs);
			if (newPreferred != null)
				msgs = ((InternalEObject)newPreferred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED, null, msgs);
			msgs = basicSetPreferred(newPreferred, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED, newPreferred, newPreferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT, oldComment, newComment);
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
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAuthoritative() {
		return authoritative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthoritative(org.hl7.fhir.Boolean newAuthoritative, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAuthoritative = authoritative;
		authoritative = newAuthoritative;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__AUTHORITATIVE, oldAuthoritative, newAuthoritative);
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
	public void setAuthoritative(org.hl7.fhir.Boolean newAuthoritative) {
		if (newAuthoritative != authoritative) {
			NotificationChain msgs = null;
			if (authoritative != null)
				msgs = ((InternalEObject)authoritative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__AUTHORITATIVE, null, msgs);
			if (newAuthoritative != null)
				msgs = ((InternalEObject)newAuthoritative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__AUTHORITATIVE, null, msgs);
			msgs = basicSetAuthoritative(newAuthoritative, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__AUTHORITATIVE, newAuthoritative, newAuthoritative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE:
				return basicSetValue(null, msgs);
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED:
				return basicSetPreferred(null, msgs);
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT:
				return basicSetComment(null, msgs);
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD:
				return basicSetPeriod(null, msgs);
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__AUTHORITATIVE:
				return basicSetAuthoritative(null, msgs);
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
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE:
				return getType();
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE:
				return getValue();
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED:
				return getPreferred();
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT:
				return getComment();
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD:
				return getPeriod();
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__AUTHORITATIVE:
				return getAuthoritative();
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
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE:
				setType((NamingSystemIdentifierType)newValue);
				return;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE:
				setValue((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED:
				setPreferred((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__AUTHORITATIVE:
				setAuthoritative((org.hl7.fhir.Boolean)newValue);
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
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE:
				setType((NamingSystemIdentifierType)null);
				return;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE:
				setValue((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED:
				setPreferred((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT:
				setComment((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD:
				setPeriod((Period)null);
				return;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__AUTHORITATIVE:
				setAuthoritative((org.hl7.fhir.Boolean)null);
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
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE:
				return type != null;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE:
				return value != null;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED:
				return preferred != null;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT:
				return comment != null;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD:
				return period != null;
			case FHIRPackage.NAMING_SYSTEM_UNIQUE_ID__AUTHORITATIVE:
				return authoritative != null;
		}
		return super.eIsSet(featureID);
	}

} //NamingSystemUniqueIdImpl
