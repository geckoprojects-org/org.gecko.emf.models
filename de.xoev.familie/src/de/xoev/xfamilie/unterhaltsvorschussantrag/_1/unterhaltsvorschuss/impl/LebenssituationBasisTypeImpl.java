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

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lebenssituation Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationBasisTypeImpl#getLedig <em>Ledig</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationBasisTypeImpl#getVerheiratet <em>Verheiratet</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationBasisTypeImpl#getLebenspartnerschaft <em>Lebenspartnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationBasisTypeImpl#getGeschieden <em>Geschieden</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationBasisTypeImpl#getVerwitwet <em>Verwitwet</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationBasisTypeImpl#getLebenspartnerschaftAufgehoben <em>Lebenspartnerschaft Aufgehoben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationBasisTypeImpl#getLebenspartnerVerstorben <em>Lebenspartner Verstorben</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LebenssituationBasisTypeImpl extends MinimalEObjectImpl.Container implements LebenssituationBasisType {
	/**
	 * The cached value of the '{@link #getLedig() <em>Ledig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLedig()
	 * @generated
	 * @ordered
	 */
	protected LedigAntragstellendeBasisType ledig;

	/**
	 * The cached value of the '{@link #getVerheiratet() <em>Verheiratet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerheiratet()
	 * @generated
	 * @ordered
	 */
	protected VerheiratetAntragstellendeBasisType verheiratet;

	/**
	 * The cached value of the '{@link #getLebenspartnerschaft() <em>Lebenspartnerschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLebenspartnerschaft()
	 * @generated
	 * @ordered
	 */
	protected LebenspartnerschaftAntragstellendeBasisType lebenspartnerschaft;

	/**
	 * The cached value of the '{@link #getGeschieden() <em>Geschieden</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschieden()
	 * @generated
	 * @ordered
	 */
	protected GeschiedenAntragstellendeBasisType geschieden;

	/**
	 * The cached value of the '{@link #getVerwitwet() <em>Verwitwet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerwitwet()
	 * @generated
	 * @ordered
	 */
	protected VerwitwetAntragstellendeBasisType verwitwet;

	/**
	 * The cached value of the '{@link #getLebenspartnerschaftAufgehoben() <em>Lebenspartnerschaft Aufgehoben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLebenspartnerschaftAufgehoben()
	 * @generated
	 * @ordered
	 */
	protected LebenspartnerschaftAufgehobenAntragstellendeBasisType lebenspartnerschaftAufgehoben;

	/**
	 * The cached value of the '{@link #getLebenspartnerVerstorben() <em>Lebenspartner Verstorben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLebenspartnerVerstorben()
	 * @generated
	 * @ordered
	 */
	protected LebenspartnerVerstorbenAntragstellendeBasisType lebenspartnerVerstorben;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LebenssituationBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getLebenssituationBasisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LedigAntragstellendeBasisType getLedig() {
		return ledig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLedig(LedigAntragstellendeBasisType newLedig, NotificationChain msgs) {
		LedigAntragstellendeBasisType oldLedig = ledig;
		ledig = newLedig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEDIG, oldLedig, newLedig);
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
	public void setLedig(LedigAntragstellendeBasisType newLedig) {
		if (newLedig != ledig) {
			NotificationChain msgs = null;
			if (ledig != null)
				msgs = ((InternalEObject)ledig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEDIG, null, msgs);
			if (newLedig != null)
				msgs = ((InternalEObject)newLedig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEDIG, null, msgs);
			msgs = basicSetLedig(newLedig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEDIG, newLedig, newLedig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerheiratetAntragstellendeBasisType getVerheiratet() {
		return verheiratet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerheiratet(VerheiratetAntragstellendeBasisType newVerheiratet, NotificationChain msgs) {
		VerheiratetAntragstellendeBasisType oldVerheiratet = verheiratet;
		verheiratet = newVerheiratet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERHEIRATET, oldVerheiratet, newVerheiratet);
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
	public void setVerheiratet(VerheiratetAntragstellendeBasisType newVerheiratet) {
		if (newVerheiratet != verheiratet) {
			NotificationChain msgs = null;
			if (verheiratet != null)
				msgs = ((InternalEObject)verheiratet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERHEIRATET, null, msgs);
			if (newVerheiratet != null)
				msgs = ((InternalEObject)newVerheiratet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERHEIRATET, null, msgs);
			msgs = basicSetVerheiratet(newVerheiratet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERHEIRATET, newVerheiratet, newVerheiratet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenspartnerschaftAntragstellendeBasisType getLebenspartnerschaft() {
		return lebenspartnerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLebenspartnerschaft(LebenspartnerschaftAntragstellendeBasisType newLebenspartnerschaft, NotificationChain msgs) {
		LebenspartnerschaftAntragstellendeBasisType oldLebenspartnerschaft = lebenspartnerschaft;
		lebenspartnerschaft = newLebenspartnerschaft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT, oldLebenspartnerschaft, newLebenspartnerschaft);
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
	public void setLebenspartnerschaft(LebenspartnerschaftAntragstellendeBasisType newLebenspartnerschaft) {
		if (newLebenspartnerschaft != lebenspartnerschaft) {
			NotificationChain msgs = null;
			if (lebenspartnerschaft != null)
				msgs = ((InternalEObject)lebenspartnerschaft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT, null, msgs);
			if (newLebenspartnerschaft != null)
				msgs = ((InternalEObject)newLebenspartnerschaft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT, null, msgs);
			msgs = basicSetLebenspartnerschaft(newLebenspartnerschaft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT, newLebenspartnerschaft, newLebenspartnerschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeschiedenAntragstellendeBasisType getGeschieden() {
		return geschieden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeschieden(GeschiedenAntragstellendeBasisType newGeschieden, NotificationChain msgs) {
		GeschiedenAntragstellendeBasisType oldGeschieden = geschieden;
		geschieden = newGeschieden;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__GESCHIEDEN, oldGeschieden, newGeschieden);
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
	public void setGeschieden(GeschiedenAntragstellendeBasisType newGeschieden) {
		if (newGeschieden != geschieden) {
			NotificationChain msgs = null;
			if (geschieden != null)
				msgs = ((InternalEObject)geschieden).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__GESCHIEDEN, null, msgs);
			if (newGeschieden != null)
				msgs = ((InternalEObject)newGeschieden).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__GESCHIEDEN, null, msgs);
			msgs = basicSetGeschieden(newGeschieden, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__GESCHIEDEN, newGeschieden, newGeschieden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerwitwetAntragstellendeBasisType getVerwitwet() {
		return verwitwet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerwitwet(VerwitwetAntragstellendeBasisType newVerwitwet, NotificationChain msgs) {
		VerwitwetAntragstellendeBasisType oldVerwitwet = verwitwet;
		verwitwet = newVerwitwet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERWITWET, oldVerwitwet, newVerwitwet);
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
	public void setVerwitwet(VerwitwetAntragstellendeBasisType newVerwitwet) {
		if (newVerwitwet != verwitwet) {
			NotificationChain msgs = null;
			if (verwitwet != null)
				msgs = ((InternalEObject)verwitwet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERWITWET, null, msgs);
			if (newVerwitwet != null)
				msgs = ((InternalEObject)newVerwitwet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERWITWET, null, msgs);
			msgs = basicSetVerwitwet(newVerwitwet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERWITWET, newVerwitwet, newVerwitwet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenspartnerschaftAufgehobenAntragstellendeBasisType getLebenspartnerschaftAufgehoben() {
		return lebenspartnerschaftAufgehoben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLebenspartnerschaftAufgehoben(LebenspartnerschaftAufgehobenAntragstellendeBasisType newLebenspartnerschaftAufgehoben, NotificationChain msgs) {
		LebenspartnerschaftAufgehobenAntragstellendeBasisType oldLebenspartnerschaftAufgehoben = lebenspartnerschaftAufgehoben;
		lebenspartnerschaftAufgehoben = newLebenspartnerschaftAufgehoben;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN, oldLebenspartnerschaftAufgehoben, newLebenspartnerschaftAufgehoben);
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
	public void setLebenspartnerschaftAufgehoben(LebenspartnerschaftAufgehobenAntragstellendeBasisType newLebenspartnerschaftAufgehoben) {
		if (newLebenspartnerschaftAufgehoben != lebenspartnerschaftAufgehoben) {
			NotificationChain msgs = null;
			if (lebenspartnerschaftAufgehoben != null)
				msgs = ((InternalEObject)lebenspartnerschaftAufgehoben).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN, null, msgs);
			if (newLebenspartnerschaftAufgehoben != null)
				msgs = ((InternalEObject)newLebenspartnerschaftAufgehoben).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN, null, msgs);
			msgs = basicSetLebenspartnerschaftAufgehoben(newLebenspartnerschaftAufgehoben, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN, newLebenspartnerschaftAufgehoben, newLebenspartnerschaftAufgehoben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenspartnerVerstorbenAntragstellendeBasisType getLebenspartnerVerstorben() {
		return lebenspartnerVerstorben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLebenspartnerVerstorben(LebenspartnerVerstorbenAntragstellendeBasisType newLebenspartnerVerstorben, NotificationChain msgs) {
		LebenspartnerVerstorbenAntragstellendeBasisType oldLebenspartnerVerstorben = lebenspartnerVerstorben;
		lebenspartnerVerstorben = newLebenspartnerVerstorben;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNER_VERSTORBEN, oldLebenspartnerVerstorben, newLebenspartnerVerstorben);
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
	public void setLebenspartnerVerstorben(LebenspartnerVerstorbenAntragstellendeBasisType newLebenspartnerVerstorben) {
		if (newLebenspartnerVerstorben != lebenspartnerVerstorben) {
			NotificationChain msgs = null;
			if (lebenspartnerVerstorben != null)
				msgs = ((InternalEObject)lebenspartnerVerstorben).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNER_VERSTORBEN, null, msgs);
			if (newLebenspartnerVerstorben != null)
				msgs = ((InternalEObject)newLebenspartnerVerstorben).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNER_VERSTORBEN, null, msgs);
			msgs = basicSetLebenspartnerVerstorben(newLebenspartnerVerstorben, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNER_VERSTORBEN, newLebenspartnerVerstorben, newLebenspartnerVerstorben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEDIG:
				return basicSetLedig(null, msgs);
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERHEIRATET:
				return basicSetVerheiratet(null, msgs);
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT:
				return basicSetLebenspartnerschaft(null, msgs);
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__GESCHIEDEN:
				return basicSetGeschieden(null, msgs);
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERWITWET:
				return basicSetVerwitwet(null, msgs);
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN:
				return basicSetLebenspartnerschaftAufgehoben(null, msgs);
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNER_VERSTORBEN:
				return basicSetLebenspartnerVerstorben(null, msgs);
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
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEDIG:
				return getLedig();
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERHEIRATET:
				return getVerheiratet();
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT:
				return getLebenspartnerschaft();
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__GESCHIEDEN:
				return getGeschieden();
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERWITWET:
				return getVerwitwet();
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN:
				return getLebenspartnerschaftAufgehoben();
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNER_VERSTORBEN:
				return getLebenspartnerVerstorben();
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
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEDIG:
				setLedig((LedigAntragstellendeBasisType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERHEIRATET:
				setVerheiratet((VerheiratetAntragstellendeBasisType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT:
				setLebenspartnerschaft((LebenspartnerschaftAntragstellendeBasisType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__GESCHIEDEN:
				setGeschieden((GeschiedenAntragstellendeBasisType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERWITWET:
				setVerwitwet((VerwitwetAntragstellendeBasisType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN:
				setLebenspartnerschaftAufgehoben((LebenspartnerschaftAufgehobenAntragstellendeBasisType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNER_VERSTORBEN:
				setLebenspartnerVerstorben((LebenspartnerVerstorbenAntragstellendeBasisType)newValue);
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
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEDIG:
				setLedig((LedigAntragstellendeBasisType)null);
				return;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERHEIRATET:
				setVerheiratet((VerheiratetAntragstellendeBasisType)null);
				return;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT:
				setLebenspartnerschaft((LebenspartnerschaftAntragstellendeBasisType)null);
				return;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__GESCHIEDEN:
				setGeschieden((GeschiedenAntragstellendeBasisType)null);
				return;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERWITWET:
				setVerwitwet((VerwitwetAntragstellendeBasisType)null);
				return;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN:
				setLebenspartnerschaftAufgehoben((LebenspartnerschaftAufgehobenAntragstellendeBasisType)null);
				return;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNER_VERSTORBEN:
				setLebenspartnerVerstorben((LebenspartnerVerstorbenAntragstellendeBasisType)null);
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
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEDIG:
				return ledig != null;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERHEIRATET:
				return verheiratet != null;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT:
				return lebenspartnerschaft != null;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__GESCHIEDEN:
				return geschieden != null;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__VERWITWET:
				return verwitwet != null;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN:
				return lebenspartnerschaftAufgehoben != null;
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNER_VERSTORBEN:
				return lebenspartnerVerstorben != null;
		}
		return super.eIsSet(featureID);
	}

} //LebenssituationBasisTypeImpl
