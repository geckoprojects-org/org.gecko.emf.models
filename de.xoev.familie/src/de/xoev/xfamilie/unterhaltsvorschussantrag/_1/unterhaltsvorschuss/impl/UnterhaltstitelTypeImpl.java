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

import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnderePersonType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unterhaltstitel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltstitelTypeImpl#getLiegtMirVor <em>Liegt Mir Vor</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltstitelTypeImpl#getTitelBeiAnderePerson <em>Titel Bei Andere Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltstitelTypeImpl#getTitelBeiInstitution <em>Titel Bei Institution</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltstitelTypeImpl#getAntragUnterhaltsfestsetzungGestellt <em>Antrag Unterhaltsfestsetzung Gestellt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltstitelTypeImpl#getBefreiungUnterhaltDurchVergleichGerichtlich <em>Befreiung Unterhalt Durch Vergleich Gerichtlich</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltstitelTypeImpl#getBefreiungUnterhaltDurchVergleichAussergerichtlich <em>Befreiung Unterhalt Durch Vergleich Aussergerichtlich</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltstitelTypeImpl#isEsGibtEinenUnterhaltstitel <em>Es Gibt Einen Unterhaltstitel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnterhaltstitelTypeImpl extends MinimalEObjectImpl.Container implements UnterhaltstitelType {
	/**
	 * The cached value of the '{@link #getLiegtMirVor() <em>Liegt Mir Vor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiegtMirVor()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitNachweisType liegtMirVor;

	/**
	 * The cached value of the '{@link #getTitelBeiAnderePerson() <em>Titel Bei Andere Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitelBeiAnderePerson()
	 * @generated
	 * @ordered
	 */
	protected AnderePersonType titelBeiAnderePerson;

	/**
	 * The cached value of the '{@link #getTitelBeiInstitution() <em>Titel Bei Institution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitelBeiInstitution()
	 * @generated
	 * @ordered
	 */
	protected InstitutionUnterhaltstitelType titelBeiInstitution;

	/**
	 * The cached value of the '{@link #getAntragUnterhaltsfestsetzungGestellt() <em>Antrag Unterhaltsfestsetzung Gestellt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragUnterhaltsfestsetzungGestellt()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitNachweisType antragUnterhaltsfestsetzungGestellt;

	/**
	 * The cached value of the '{@link #getBefreiungUnterhaltDurchVergleichGerichtlich() <em>Befreiung Unterhalt Durch Vergleich Gerichtlich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefreiungUnterhaltDurchVergleichGerichtlich()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitNachweisType befreiungUnterhaltDurchVergleichGerichtlich;

	/**
	 * The cached value of the '{@link #getBefreiungUnterhaltDurchVergleichAussergerichtlich() <em>Befreiung Unterhalt Durch Vergleich Aussergerichtlich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefreiungUnterhaltDurchVergleichAussergerichtlich()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitNachweisType befreiungUnterhaltDurchVergleichAussergerichtlich;

	/**
	 * The default value of the '{@link #isEsGibtEinenUnterhaltstitel() <em>Es Gibt Einen Unterhaltstitel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsGibtEinenUnterhaltstitel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_GIBT_EINEN_UNTERHALTSTITEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsGibtEinenUnterhaltstitel() <em>Es Gibt Einen Unterhaltstitel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsGibtEinenUnterhaltstitel()
	 * @generated
	 * @ordered
	 */
	protected boolean esGibtEinenUnterhaltstitel = ES_GIBT_EINEN_UNTERHALTSTITEL_EDEFAULT;

	/**
	 * This is true if the Es Gibt Einen Unterhaltstitel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean esGibtEinenUnterhaltstitelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnterhaltstitelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getUnterhaltstitelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType getLiegtMirVor() {
		return liegtMirVor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiegtMirVor(TatsacheMitNachweisType newLiegtMirVor, NotificationChain msgs) {
		TatsacheMitNachweisType oldLiegtMirVor = liegtMirVor;
		liegtMirVor = newLiegtMirVor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__LIEGT_MIR_VOR, oldLiegtMirVor, newLiegtMirVor);
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
	public void setLiegtMirVor(TatsacheMitNachweisType newLiegtMirVor) {
		if (newLiegtMirVor != liegtMirVor) {
			NotificationChain msgs = null;
			if (liegtMirVor != null)
				msgs = ((InternalEObject)liegtMirVor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__LIEGT_MIR_VOR, null, msgs);
			if (newLiegtMirVor != null)
				msgs = ((InternalEObject)newLiegtMirVor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__LIEGT_MIR_VOR, null, msgs);
			msgs = basicSetLiegtMirVor(newLiegtMirVor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__LIEGT_MIR_VOR, newLiegtMirVor, newLiegtMirVor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnderePersonType getTitelBeiAnderePerson() {
		return titelBeiAnderePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitelBeiAnderePerson(AnderePersonType newTitelBeiAnderePerson, NotificationChain msgs) {
		AnderePersonType oldTitelBeiAnderePerson = titelBeiAnderePerson;
		titelBeiAnderePerson = newTitelBeiAnderePerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_ANDERE_PERSON, oldTitelBeiAnderePerson, newTitelBeiAnderePerson);
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
	public void setTitelBeiAnderePerson(AnderePersonType newTitelBeiAnderePerson) {
		if (newTitelBeiAnderePerson != titelBeiAnderePerson) {
			NotificationChain msgs = null;
			if (titelBeiAnderePerson != null)
				msgs = ((InternalEObject)titelBeiAnderePerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_ANDERE_PERSON, null, msgs);
			if (newTitelBeiAnderePerson != null)
				msgs = ((InternalEObject)newTitelBeiAnderePerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_ANDERE_PERSON, null, msgs);
			msgs = basicSetTitelBeiAnderePerson(newTitelBeiAnderePerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_ANDERE_PERSON, newTitelBeiAnderePerson, newTitelBeiAnderePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstitutionUnterhaltstitelType getTitelBeiInstitution() {
		return titelBeiInstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitelBeiInstitution(InstitutionUnterhaltstitelType newTitelBeiInstitution, NotificationChain msgs) {
		InstitutionUnterhaltstitelType oldTitelBeiInstitution = titelBeiInstitution;
		titelBeiInstitution = newTitelBeiInstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_INSTITUTION, oldTitelBeiInstitution, newTitelBeiInstitution);
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
	public void setTitelBeiInstitution(InstitutionUnterhaltstitelType newTitelBeiInstitution) {
		if (newTitelBeiInstitution != titelBeiInstitution) {
			NotificationChain msgs = null;
			if (titelBeiInstitution != null)
				msgs = ((InternalEObject)titelBeiInstitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_INSTITUTION, null, msgs);
			if (newTitelBeiInstitution != null)
				msgs = ((InternalEObject)newTitelBeiInstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_INSTITUTION, null, msgs);
			msgs = basicSetTitelBeiInstitution(newTitelBeiInstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_INSTITUTION, newTitelBeiInstitution, newTitelBeiInstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType getAntragUnterhaltsfestsetzungGestellt() {
		return antragUnterhaltsfestsetzungGestellt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntragUnterhaltsfestsetzungGestellt(TatsacheMitNachweisType newAntragUnterhaltsfestsetzungGestellt, NotificationChain msgs) {
		TatsacheMitNachweisType oldAntragUnterhaltsfestsetzungGestellt = antragUnterhaltsfestsetzungGestellt;
		antragUnterhaltsfestsetzungGestellt = newAntragUnterhaltsfestsetzungGestellt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ANTRAG_UNTERHALTSFESTSETZUNG_GESTELLT, oldAntragUnterhaltsfestsetzungGestellt, newAntragUnterhaltsfestsetzungGestellt);
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
	public void setAntragUnterhaltsfestsetzungGestellt(TatsacheMitNachweisType newAntragUnterhaltsfestsetzungGestellt) {
		if (newAntragUnterhaltsfestsetzungGestellt != antragUnterhaltsfestsetzungGestellt) {
			NotificationChain msgs = null;
			if (antragUnterhaltsfestsetzungGestellt != null)
				msgs = ((InternalEObject)antragUnterhaltsfestsetzungGestellt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ANTRAG_UNTERHALTSFESTSETZUNG_GESTELLT, null, msgs);
			if (newAntragUnterhaltsfestsetzungGestellt != null)
				msgs = ((InternalEObject)newAntragUnterhaltsfestsetzungGestellt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ANTRAG_UNTERHALTSFESTSETZUNG_GESTELLT, null, msgs);
			msgs = basicSetAntragUnterhaltsfestsetzungGestellt(newAntragUnterhaltsfestsetzungGestellt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ANTRAG_UNTERHALTSFESTSETZUNG_GESTELLT, newAntragUnterhaltsfestsetzungGestellt, newAntragUnterhaltsfestsetzungGestellt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType getBefreiungUnterhaltDurchVergleichGerichtlich() {
		return befreiungUnterhaltDurchVergleichGerichtlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefreiungUnterhaltDurchVergleichGerichtlich(TatsacheMitNachweisType newBefreiungUnterhaltDurchVergleichGerichtlich, NotificationChain msgs) {
		TatsacheMitNachweisType oldBefreiungUnterhaltDurchVergleichGerichtlich = befreiungUnterhaltDurchVergleichGerichtlich;
		befreiungUnterhaltDurchVergleichGerichtlich = newBefreiungUnterhaltDurchVergleichGerichtlich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_GERICHTLICH, oldBefreiungUnterhaltDurchVergleichGerichtlich, newBefreiungUnterhaltDurchVergleichGerichtlich);
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
	public void setBefreiungUnterhaltDurchVergleichGerichtlich(TatsacheMitNachweisType newBefreiungUnterhaltDurchVergleichGerichtlich) {
		if (newBefreiungUnterhaltDurchVergleichGerichtlich != befreiungUnterhaltDurchVergleichGerichtlich) {
			NotificationChain msgs = null;
			if (befreiungUnterhaltDurchVergleichGerichtlich != null)
				msgs = ((InternalEObject)befreiungUnterhaltDurchVergleichGerichtlich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_GERICHTLICH, null, msgs);
			if (newBefreiungUnterhaltDurchVergleichGerichtlich != null)
				msgs = ((InternalEObject)newBefreiungUnterhaltDurchVergleichGerichtlich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_GERICHTLICH, null, msgs);
			msgs = basicSetBefreiungUnterhaltDurchVergleichGerichtlich(newBefreiungUnterhaltDurchVergleichGerichtlich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_GERICHTLICH, newBefreiungUnterhaltDurchVergleichGerichtlich, newBefreiungUnterhaltDurchVergleichGerichtlich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType getBefreiungUnterhaltDurchVergleichAussergerichtlich() {
		return befreiungUnterhaltDurchVergleichAussergerichtlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefreiungUnterhaltDurchVergleichAussergerichtlich(TatsacheMitNachweisType newBefreiungUnterhaltDurchVergleichAussergerichtlich, NotificationChain msgs) {
		TatsacheMitNachweisType oldBefreiungUnterhaltDurchVergleichAussergerichtlich = befreiungUnterhaltDurchVergleichAussergerichtlich;
		befreiungUnterhaltDurchVergleichAussergerichtlich = newBefreiungUnterhaltDurchVergleichAussergerichtlich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_AUSSERGERICHTLICH, oldBefreiungUnterhaltDurchVergleichAussergerichtlich, newBefreiungUnterhaltDurchVergleichAussergerichtlich);
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
	public void setBefreiungUnterhaltDurchVergleichAussergerichtlich(TatsacheMitNachweisType newBefreiungUnterhaltDurchVergleichAussergerichtlich) {
		if (newBefreiungUnterhaltDurchVergleichAussergerichtlich != befreiungUnterhaltDurchVergleichAussergerichtlich) {
			NotificationChain msgs = null;
			if (befreiungUnterhaltDurchVergleichAussergerichtlich != null)
				msgs = ((InternalEObject)befreiungUnterhaltDurchVergleichAussergerichtlich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_AUSSERGERICHTLICH, null, msgs);
			if (newBefreiungUnterhaltDurchVergleichAussergerichtlich != null)
				msgs = ((InternalEObject)newBefreiungUnterhaltDurchVergleichAussergerichtlich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_AUSSERGERICHTLICH, null, msgs);
			msgs = basicSetBefreiungUnterhaltDurchVergleichAussergerichtlich(newBefreiungUnterhaltDurchVergleichAussergerichtlich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_AUSSERGERICHTLICH, newBefreiungUnterhaltDurchVergleichAussergerichtlich, newBefreiungUnterhaltDurchVergleichAussergerichtlich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEsGibtEinenUnterhaltstitel() {
		return esGibtEinenUnterhaltstitel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEsGibtEinenUnterhaltstitel(boolean newEsGibtEinenUnterhaltstitel) {
		boolean oldEsGibtEinenUnterhaltstitel = esGibtEinenUnterhaltstitel;
		esGibtEinenUnterhaltstitel = newEsGibtEinenUnterhaltstitel;
		boolean oldEsGibtEinenUnterhaltstitelESet = esGibtEinenUnterhaltstitelESet;
		esGibtEinenUnterhaltstitelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ES_GIBT_EINEN_UNTERHALTSTITEL, oldEsGibtEinenUnterhaltstitel, esGibtEinenUnterhaltstitel, !oldEsGibtEinenUnterhaltstitelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEsGibtEinenUnterhaltstitel() {
		boolean oldEsGibtEinenUnterhaltstitel = esGibtEinenUnterhaltstitel;
		boolean oldEsGibtEinenUnterhaltstitelESet = esGibtEinenUnterhaltstitelESet;
		esGibtEinenUnterhaltstitel = ES_GIBT_EINEN_UNTERHALTSTITEL_EDEFAULT;
		esGibtEinenUnterhaltstitelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ES_GIBT_EINEN_UNTERHALTSTITEL, oldEsGibtEinenUnterhaltstitel, ES_GIBT_EINEN_UNTERHALTSTITEL_EDEFAULT, oldEsGibtEinenUnterhaltstitelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEsGibtEinenUnterhaltstitel() {
		return esGibtEinenUnterhaltstitelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__LIEGT_MIR_VOR:
				return basicSetLiegtMirVor(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_ANDERE_PERSON:
				return basicSetTitelBeiAnderePerson(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_INSTITUTION:
				return basicSetTitelBeiInstitution(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ANTRAG_UNTERHALTSFESTSETZUNG_GESTELLT:
				return basicSetAntragUnterhaltsfestsetzungGestellt(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_GERICHTLICH:
				return basicSetBefreiungUnterhaltDurchVergleichGerichtlich(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_AUSSERGERICHTLICH:
				return basicSetBefreiungUnterhaltDurchVergleichAussergerichtlich(null, msgs);
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
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__LIEGT_MIR_VOR:
				return getLiegtMirVor();
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_ANDERE_PERSON:
				return getTitelBeiAnderePerson();
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_INSTITUTION:
				return getTitelBeiInstitution();
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ANTRAG_UNTERHALTSFESTSETZUNG_GESTELLT:
				return getAntragUnterhaltsfestsetzungGestellt();
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_GERICHTLICH:
				return getBefreiungUnterhaltDurchVergleichGerichtlich();
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_AUSSERGERICHTLICH:
				return getBefreiungUnterhaltDurchVergleichAussergerichtlich();
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ES_GIBT_EINEN_UNTERHALTSTITEL:
				return isEsGibtEinenUnterhaltstitel();
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
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__LIEGT_MIR_VOR:
				setLiegtMirVor((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_ANDERE_PERSON:
				setTitelBeiAnderePerson((AnderePersonType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_INSTITUTION:
				setTitelBeiInstitution((InstitutionUnterhaltstitelType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ANTRAG_UNTERHALTSFESTSETZUNG_GESTELLT:
				setAntragUnterhaltsfestsetzungGestellt((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_GERICHTLICH:
				setBefreiungUnterhaltDurchVergleichGerichtlich((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_AUSSERGERICHTLICH:
				setBefreiungUnterhaltDurchVergleichAussergerichtlich((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ES_GIBT_EINEN_UNTERHALTSTITEL:
				setEsGibtEinenUnterhaltstitel((Boolean)newValue);
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
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__LIEGT_MIR_VOR:
				setLiegtMirVor((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_ANDERE_PERSON:
				setTitelBeiAnderePerson((AnderePersonType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_INSTITUTION:
				setTitelBeiInstitution((InstitutionUnterhaltstitelType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ANTRAG_UNTERHALTSFESTSETZUNG_GESTELLT:
				setAntragUnterhaltsfestsetzungGestellt((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_GERICHTLICH:
				setBefreiungUnterhaltDurchVergleichGerichtlich((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_AUSSERGERICHTLICH:
				setBefreiungUnterhaltDurchVergleichAussergerichtlich((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ES_GIBT_EINEN_UNTERHALTSTITEL:
				unsetEsGibtEinenUnterhaltstitel();
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
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__LIEGT_MIR_VOR:
				return liegtMirVor != null;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_ANDERE_PERSON:
				return titelBeiAnderePerson != null;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__TITEL_BEI_INSTITUTION:
				return titelBeiInstitution != null;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ANTRAG_UNTERHALTSFESTSETZUNG_GESTELLT:
				return antragUnterhaltsfestsetzungGestellt != null;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_GERICHTLICH:
				return befreiungUnterhaltDurchVergleichGerichtlich != null;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_AUSSERGERICHTLICH:
				return befreiungUnterhaltDurchVergleichAussergerichtlich != null;
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE__ES_GIBT_EINEN_UNTERHALTSTITEL:
				return isSetEsGibtEinenUnterhaltstitel();
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
		result.append(" (esGibtEinenUnterhaltstitel: ");
		if (esGibtEinenUnterhaltstitelESet) result.append(esGibtEinenUnterhaltstitel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UnterhaltstitelTypeImpl
