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
package de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl;

import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedPackage;
import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType;
import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.CodeVerzeichnisdienstType;
import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behoerde Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BehoerdeTypeImpl#getVerzeichnisdienst <em>Verzeichnisdienst</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BehoerdeTypeImpl#getKennung <em>Kennung</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BehoerdeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BehoerdeTypeImpl#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehoerdeTypeImpl extends MinimalEObjectImpl.Container implements BehoerdeType {
	/**
	 * The cached value of the '{@link #getVerzeichnisdienst() <em>Verzeichnisdienst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerzeichnisdienst()
	 * @generated
	 * @ordered
	 */
	protected CodeVerzeichnisdienstType verzeichnisdienst;

	/**
	 * The default value of the '{@link #getKennung() <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennung()
	 * @generated
	 * @ordered
	 */
	protected static final String KENNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKennung() <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennung()
	 * @generated
	 * @ordered
	 */
	protected String kennung = KENNUNG_EDEFAULT;

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
	 * The cached value of the '{@link #getErreichbarkeit() <em>Erreichbarkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErreichbarkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<KommunikationType> erreichbarkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehoerdeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisnachrichtUnqualifiedPackage.Literals.BEHOERDE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVerzeichnisdienstType getVerzeichnisdienst() {
		return verzeichnisdienst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerzeichnisdienst(CodeVerzeichnisdienstType newVerzeichnisdienst, NotificationChain msgs) {
		CodeVerzeichnisdienstType oldVerzeichnisdienst = verzeichnisdienst;
		verzeichnisdienst = newVerzeichnisdienst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__VERZEICHNISDIENST, oldVerzeichnisdienst, newVerzeichnisdienst);
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
	public void setVerzeichnisdienst(CodeVerzeichnisdienstType newVerzeichnisdienst) {
		if (newVerzeichnisdienst != verzeichnisdienst) {
			NotificationChain msgs = null;
			if (verzeichnisdienst != null)
				msgs = ((InternalEObject)verzeichnisdienst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__VERZEICHNISDIENST, null, msgs);
			if (newVerzeichnisdienst != null)
				msgs = ((InternalEObject)newVerzeichnisdienst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__VERZEICHNISDIENST, null, msgs);
			msgs = basicSetVerzeichnisdienst(newVerzeichnisdienst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__VERZEICHNISDIENST, newVerzeichnisdienst, newVerzeichnisdienst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKennung() {
		return kennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKennung(String newKennung) {
		String oldKennung = kennung;
		kennung = newKennung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__KENNUNG, oldKennung, kennung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KommunikationType> getErreichbarkeit() {
		if (erreichbarkeit == null) {
			erreichbarkeit = new EObjectContainmentEList<KommunikationType>(KommunikationType.class, this, BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__ERREICHBARKEIT);
		}
		return erreichbarkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__VERZEICHNISDIENST:
				return basicSetVerzeichnisdienst(null, msgs);
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__ERREICHBARKEIT:
				return ((InternalEList<?>)getErreichbarkeit()).basicRemove(otherEnd, msgs);
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
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__VERZEICHNISDIENST:
				return getVerzeichnisdienst();
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__KENNUNG:
				return getKennung();
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__NAME:
				return getName();
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__ERREICHBARKEIT:
				return getErreichbarkeit();
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
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__VERZEICHNISDIENST:
				setVerzeichnisdienst((CodeVerzeichnisdienstType)newValue);
				return;
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__KENNUNG:
				setKennung((String)newValue);
				return;
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__NAME:
				setName((String)newValue);
				return;
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
				getErreichbarkeit().addAll((Collection<? extends KommunikationType>)newValue);
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
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__VERZEICHNISDIENST:
				setVerzeichnisdienst((CodeVerzeichnisdienstType)null);
				return;
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__KENNUNG:
				setKennung(KENNUNG_EDEFAULT);
				return;
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
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
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__VERZEICHNISDIENST:
				return verzeichnisdienst != null;
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__KENNUNG:
				return KENNUNG_EDEFAULT == null ? kennung != null : !KENNUNG_EDEFAULT.equals(kennung);
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE__ERREICHBARKEIT:
				return erreichbarkeit != null && !erreichbarkeit.isEmpty();
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
		result.append(" (kennung: ");
		result.append(kennung);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BehoerdeTypeImpl
