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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.PfadelementType;
import de.xoev.domea.domea.StrukturelementTypCodeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pfadelement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.PfadelementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.PfadelementTypeImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.PfadelementTypeImpl#getPfadelement <em>Pfadelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PfadelementTypeImpl extends MinimalEObjectImpl.Container implements PfadelementType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected StrukturelementTypCodeType typ;

	/**
	 * The cached value of the '{@link #getPfadelement() <em>Pfadelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfadelement()
	 * @generated
	 * @ordered
	 */
	protected PfadelementType pfadelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PfadelementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.PFADELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.PFADELEMENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrukturelementTypCodeType getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTyp(StrukturelementTypCodeType newTyp, NotificationChain msgs) {
		StrukturelementTypCodeType oldTyp = typ;
		typ = newTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.PFADELEMENT_TYPE__TYP, oldTyp, newTyp);
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
	public void setTyp(StrukturelementTypCodeType newTyp) {
		if (newTyp != typ) {
			NotificationChain msgs = null;
			if (typ != null)
				msgs = ((InternalEObject)typ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.PFADELEMENT_TYPE__TYP, null, msgs);
			if (newTyp != null)
				msgs = ((InternalEObject)newTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.PFADELEMENT_TYPE__TYP, null, msgs);
			msgs = basicSetTyp(newTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.PFADELEMENT_TYPE__TYP, newTyp, newTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PfadelementType getPfadelement() {
		return pfadelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPfadelement(PfadelementType newPfadelement, NotificationChain msgs) {
		PfadelementType oldPfadelement = pfadelement;
		pfadelement = newPfadelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.PFADELEMENT_TYPE__PFADELEMENT, oldPfadelement, newPfadelement);
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
	public void setPfadelement(PfadelementType newPfadelement) {
		if (newPfadelement != pfadelement) {
			NotificationChain msgs = null;
			if (pfadelement != null)
				msgs = ((InternalEObject)pfadelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.PFADELEMENT_TYPE__PFADELEMENT, null, msgs);
			if (newPfadelement != null)
				msgs = ((InternalEObject)newPfadelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.PFADELEMENT_TYPE__PFADELEMENT, null, msgs);
			msgs = basicSetPfadelement(newPfadelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.PFADELEMENT_TYPE__PFADELEMENT, newPfadelement, newPfadelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.PFADELEMENT_TYPE__TYP:
				return basicSetTyp(null, msgs);
			case DomeaPackage.PFADELEMENT_TYPE__PFADELEMENT:
				return basicSetPfadelement(null, msgs);
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
			case DomeaPackage.PFADELEMENT_TYPE__NAME:
				return getName();
			case DomeaPackage.PFADELEMENT_TYPE__TYP:
				return getTyp();
			case DomeaPackage.PFADELEMENT_TYPE__PFADELEMENT:
				return getPfadelement();
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
			case DomeaPackage.PFADELEMENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case DomeaPackage.PFADELEMENT_TYPE__TYP:
				setTyp((StrukturelementTypCodeType)newValue);
				return;
			case DomeaPackage.PFADELEMENT_TYPE__PFADELEMENT:
				setPfadelement((PfadelementType)newValue);
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
			case DomeaPackage.PFADELEMENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomeaPackage.PFADELEMENT_TYPE__TYP:
				setTyp((StrukturelementTypCodeType)null);
				return;
			case DomeaPackage.PFADELEMENT_TYPE__PFADELEMENT:
				setPfadelement((PfadelementType)null);
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
			case DomeaPackage.PFADELEMENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomeaPackage.PFADELEMENT_TYPE__TYP:
				return typ != null;
			case DomeaPackage.PFADELEMENT_TYPE__PFADELEMENT:
				return pfadelement != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PfadelementTypeImpl
