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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeTatsachenbehauptungType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traeger Krankenversicherung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.TraegerKrankenversicherungTypeImpl#getBekannt <em>Bekannt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.TraegerKrankenversicherungTypeImpl#getKvNummer <em>Kv Nummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.TraegerKrankenversicherungTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraegerKrankenversicherungTypeImpl extends MinimalEObjectImpl.Container implements TraegerKrankenversicherungType {
	/**
	 * The cached value of the '{@link #getBekannt() <em>Bekannt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBekannt()
	 * @generated
	 * @ordered
	 */
	protected CodeTatsachenbehauptungType bekannt;

	/**
	 * The default value of the '{@link #getKvNummer() <em>Kv Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKvNummer()
	 * @generated
	 * @ordered
	 */
	protected static final String KV_NUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKvNummer() <em>Kv Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKvNummer()
	 * @generated
	 * @ordered
	 */
	protected String kvNummer = KV_NUMMER_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraegerKrankenversicherungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getTraegerKrankenversicherungType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeTatsachenbehauptungType getBekannt() {
		return bekannt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBekannt(CodeTatsachenbehauptungType newBekannt, NotificationChain msgs) {
		CodeTatsachenbehauptungType oldBekannt = bekannt;
		bekannt = newBekannt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__BEKANNT, oldBekannt, newBekannt);
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
	public void setBekannt(CodeTatsachenbehauptungType newBekannt) {
		if (newBekannt != bekannt) {
			NotificationChain msgs = null;
			if (bekannt != null)
				msgs = ((InternalEObject)bekannt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__BEKANNT, null, msgs);
			if (newBekannt != null)
				msgs = ((InternalEObject)newBekannt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__BEKANNT, null, msgs);
			msgs = basicSetBekannt(newBekannt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__BEKANNT, newBekannt, newBekannt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKvNummer() {
		return kvNummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKvNummer(String newKvNummer) {
		String oldKvNummer = kvNummer;
		kvNummer = newKvNummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__KV_NUMMER, oldKvNummer, kvNummer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__BEKANNT:
				return basicSetBekannt(null, msgs);
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
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__BEKANNT:
				return getBekannt();
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__KV_NUMMER:
				return getKvNummer();
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__NAME:
				return getName();
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
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__BEKANNT:
				setBekannt((CodeTatsachenbehauptungType)newValue);
				return;
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__KV_NUMMER:
				setKvNummer((String)newValue);
				return;
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__NAME:
				setName((String)newValue);
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
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__BEKANNT:
				setBekannt((CodeTatsachenbehauptungType)null);
				return;
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__KV_NUMMER:
				setKvNummer(KV_NUMMER_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__BEKANNT:
				return bekannt != null;
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__KV_NUMMER:
				return KV_NUMMER_EDEFAULT == null ? kvNummer != null : !KV_NUMMER_EDEFAULT.equals(kvNummer);
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (kvNummer: ");
		result.append(kvNummer);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TraegerKrankenversicherungTypeImpl
