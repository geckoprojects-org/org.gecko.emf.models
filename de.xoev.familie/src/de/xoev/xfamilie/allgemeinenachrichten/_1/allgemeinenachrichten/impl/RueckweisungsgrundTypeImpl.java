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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.CodeRueckweisungsgrundType;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType;

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
 * An implementation of the model object '<em><b>Rueckweisungsgrund Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisungsgrundTypeImpl#getGrund <em>Grund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisungsgrundTypeImpl#getGrundSpezifisch <em>Grund Spezifisch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RueckweisungsgrundTypeImpl extends MinimalEObjectImpl.Container implements RueckweisungsgrundType {
	/**
	 * The cached value of the '{@link #getGrund() <em>Grund</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrund()
	 * @generated
	 * @ordered
	 */
	protected CodeRueckweisungsgrundType grund;

	/**
	 * The cached value of the '{@link #getGrundSpezifisch() <em>Grund Spezifisch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrundSpezifisch()
	 * @generated
	 * @ordered
	 */
	protected EList<RueckweisungsgrundSpezifischType> grundSpezifisch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RueckweisungsgrundTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllgemeineNachrichtenPackage.Literals.RUECKWEISUNGSGRUND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeRueckweisungsgrundType getGrund() {
		return grund;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrund(CodeRueckweisungsgrundType newGrund, NotificationChain msgs) {
		CodeRueckweisungsgrundType oldGrund = grund;
		grund = newGrund;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND, oldGrund, newGrund);
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
	public void setGrund(CodeRueckweisungsgrundType newGrund) {
		if (newGrund != grund) {
			NotificationChain msgs = null;
			if (grund != null)
				msgs = ((InternalEObject)grund).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND, null, msgs);
			if (newGrund != null)
				msgs = ((InternalEObject)newGrund).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND, null, msgs);
			msgs = basicSetGrund(newGrund, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND, newGrund, newGrund));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RueckweisungsgrundSpezifischType> getGrundSpezifisch() {
		if (grundSpezifisch == null) {
			grundSpezifisch = new EObjectContainmentEList<RueckweisungsgrundSpezifischType>(RueckweisungsgrundSpezifischType.class, this, AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND_SPEZIFISCH);
		}
		return grundSpezifisch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND:
				return basicSetGrund(null, msgs);
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND_SPEZIFISCH:
				return ((InternalEList<?>)getGrundSpezifisch()).basicRemove(otherEnd, msgs);
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
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND:
				return getGrund();
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND_SPEZIFISCH:
				return getGrundSpezifisch();
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
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND:
				setGrund((CodeRueckweisungsgrundType)newValue);
				return;
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND_SPEZIFISCH:
				getGrundSpezifisch().clear();
				getGrundSpezifisch().addAll((Collection<? extends RueckweisungsgrundSpezifischType>)newValue);
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
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND:
				setGrund((CodeRueckweisungsgrundType)null);
				return;
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND_SPEZIFISCH:
				getGrundSpezifisch().clear();
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
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND:
				return grund != null;
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE__GRUND_SPEZIFISCH:
				return grundSpezifisch != null && !grundSpezifisch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RueckweisungsgrundTypeImpl
