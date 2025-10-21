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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeAbbruchgrundType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elterngeldantrag Abbruch0206 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAbbruch0206TypeImpl#getAnfrageID <em>Anfrage ID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAbbruch0206TypeImpl#getGrundAbbruch <em>Grund Abbruch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElterngeldantragAbbruch0206TypeImpl extends AntragsnachrichtTypeImpl implements ElterngeldantragAbbruch0206Type {
	/**
	 * The default value of the '{@link #getAnfrageID() <em>Anfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnfrageID()
	 * @generated
	 * @ordered
	 */
	protected static final String ANFRAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnfrageID() <em>Anfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnfrageID()
	 * @generated
	 * @ordered
	 */
	protected String anfrageID = ANFRAGE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrundAbbruch() <em>Grund Abbruch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrundAbbruch()
	 * @generated
	 * @ordered
	 */
	protected CodeAbbruchgrundType grundAbbruch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElterngeldantragAbbruch0206TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getElterngeldantragAbbruch0206Type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnfrageID() {
		return anfrageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnfrageID(String newAnfrageID) {
		String oldAnfrageID = anfrageID;
		anfrageID = newAnfrageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__ANFRAGE_ID, oldAnfrageID, anfrageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAbbruchgrundType getGrundAbbruch() {
		return grundAbbruch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrundAbbruch(CodeAbbruchgrundType newGrundAbbruch, NotificationChain msgs) {
		CodeAbbruchgrundType oldGrundAbbruch = grundAbbruch;
		grundAbbruch = newGrundAbbruch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__GRUND_ABBRUCH, oldGrundAbbruch, newGrundAbbruch);
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
	public void setGrundAbbruch(CodeAbbruchgrundType newGrundAbbruch) {
		if (newGrundAbbruch != grundAbbruch) {
			NotificationChain msgs = null;
			if (grundAbbruch != null)
				msgs = ((InternalEObject)grundAbbruch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__GRUND_ABBRUCH, null, msgs);
			if (newGrundAbbruch != null)
				msgs = ((InternalEObject)newGrundAbbruch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__GRUND_ABBRUCH, null, msgs);
			msgs = basicSetGrundAbbruch(newGrundAbbruch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__GRUND_ABBRUCH, newGrundAbbruch, newGrundAbbruch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__GRUND_ABBRUCH:
				return basicSetGrundAbbruch(null, msgs);
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
			case ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__ANFRAGE_ID:
				return getAnfrageID();
			case ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__GRUND_ABBRUCH:
				return getGrundAbbruch();
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
			case ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__ANFRAGE_ID:
				setAnfrageID((String)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__GRUND_ABBRUCH:
				setGrundAbbruch((CodeAbbruchgrundType)newValue);
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
			case ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__ANFRAGE_ID:
				setAnfrageID(ANFRAGE_ID_EDEFAULT);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__GRUND_ABBRUCH:
				setGrundAbbruch((CodeAbbruchgrundType)null);
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
			case ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__ANFRAGE_ID:
				return ANFRAGE_ID_EDEFAULT == null ? anfrageID != null : !ANFRAGE_ID_EDEFAULT.equals(anfrageID);
			case ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE__GRUND_ABBRUCH:
				return grundAbbruch != null;
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
		result.append(" (anfrageID: ");
		result.append(anfrageID);
		result.append(')');
		return result.toString();
	}

} //ElterngeldantragAbbruch0206TypeImpl
