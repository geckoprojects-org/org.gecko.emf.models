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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType;
import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Antragskind Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getGeburtsurkunde <em>Geburtsurkunde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getAufenthaltstitel <em>Aufenthaltstitel</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getAufenthalt <em>Aufenthalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getVertretung <em>Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getEinkuenfte <em>Einkuenfte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getSonstigeLeistung <em>Sonstige Leistung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getAnderePersonVerstorben <em>Andere Person Verstorben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getMitbetreuungDurchAnderenElternteil <em>Mitbetreuung Durch Anderen Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getSchule <em>Schule</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getStudium <em>Studium</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getGeschlecht <em>Geschlecht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl#getAktenzeichen <em>Aktenzeichen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AntragskindBasisTypeImpl extends MinimalEObjectImpl.Container implements AntragskindBasisType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameOptionalType name;

	/**
	 * The cached value of the '{@link #getGeburt() <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburt()
	 * @generated
	 * @ordered
	 */
	protected GeburtGeburtsortOptionalType geburt;

	/**
	 * The cached value of the '{@link #getGeburtsurkunde() <em>Geburtsurkunde</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsurkunde()
	 * @generated
	 * @ordered
	 */
	protected EList<String> geburtsurkunde;

	/**
	 * The cached value of the '{@link #getAufenthaltstitel() <em>Aufenthaltstitel</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthaltstitel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aufenthaltstitel;

	/**
	 * The cached value of the '{@link #getStaatsangehoerigkeit() <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 * @ordered
	 */
	protected StaatsangehoerigkeitType staatsangehoerigkeit;

	/**
	 * The cached value of the '{@link #getAufenthalt() <em>Aufenthalt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthalt()
	 * @generated
	 * @ordered
	 */
	protected EList<AufenthaltKindBasisType> aufenthalt;

	/**
	 * The cached value of the '{@link #getVertretung() <em>Vertretung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertretung()
	 * @generated
	 * @ordered
	 */
	protected EList<VertretungType> vertretung;

	/**
	 * The cached value of the '{@link #getEinkuenfte() <em>Einkuenfte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkuenfte()
	 * @generated
	 * @ordered
	 */
	protected EList<EinkuenfteKindType> einkuenfte;

	/**
	 * The cached value of the '{@link #getSonstigeLeistung() <em>Sonstige Leistung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonstigeLeistung()
	 * @generated
	 * @ordered
	 */
	protected EList<SonstigeLeistungKindType> sonstigeLeistung;

	/**
	 * The cached value of the '{@link #getAnderePersonVerstorben() <em>Andere Person Verstorben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnderePersonVerstorben()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitNachweisType anderePersonVerstorben;

	/**
	 * The cached value of the '{@link #getMitbetreuungDurchAnderenElternteil() <em>Mitbetreuung Durch Anderen Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitbetreuungDurchAnderenElternteil()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitFreitextType mitbetreuungDurchAnderenElternteil;

	/**
	 * The cached value of the '{@link #getSchule() <em>Schule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchule()
	 * @generated
	 * @ordered
	 */
	protected SchuleType schule;

	/**
	 * The cached value of the '{@link #getStudium() <em>Studium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudium()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitNachweisType studium;

	/**
	 * The cached value of the '{@link #getGeschlecht() <em>Geschlecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschlecht()
	 * @generated
	 * @ordered
	 */
	protected CodeGeschlechtType geschlecht;

	/**
	 * The default value of the '{@link #getAktenzeichen() <em>Aktenzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichen()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTENZEICHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktenzeichen() <em>Aktenzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichen()
	 * @generated
	 * @ordered
	 */
	protected String aktenzeichen = AKTENZEICHEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntragskindBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getAntragskindBasisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameOptionalType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameOptionalType newName, NotificationChain msgs) {
		NameOptionalType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__NAME, oldName, newName);
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
	public void setName(NameOptionalType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtGeburtsortOptionalType getGeburt() {
		return geburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburt(GeburtGeburtsortOptionalType newGeburt, NotificationChain msgs) {
		GeburtGeburtsortOptionalType oldGeburt = geburt;
		geburt = newGeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURT, oldGeburt, newGeburt);
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
	public void setGeburt(GeburtGeburtsortOptionalType newGeburt) {
		if (newGeburt != geburt) {
			NotificationChain msgs = null;
			if (geburt != null)
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURT, newGeburt, newGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getGeburtsurkunde() {
		if (geburtsurkunde == null) {
			geburtsurkunde = new EDataTypeEList<String>(String.class, this, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURTSURKUNDE);
		}
		return geburtsurkunde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAufenthaltstitel() {
		if (aufenthaltstitel == null) {
			aufenthaltstitel = new EDataTypeEList<String>(String.class, this, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AUFENTHALTSTITEL);
		}
		return aufenthaltstitel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaatsangehoerigkeitType getStaatsangehoerigkeit() {
		return staatsangehoerigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaatsangehoerigkeit(StaatsangehoerigkeitType newStaatsangehoerigkeit, NotificationChain msgs) {
		StaatsangehoerigkeitType oldStaatsangehoerigkeit = staatsangehoerigkeit;
		staatsangehoerigkeit = newStaatsangehoerigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STAATSANGEHOERIGKEIT, oldStaatsangehoerigkeit, newStaatsangehoerigkeit);
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
	public void setStaatsangehoerigkeit(StaatsangehoerigkeitType newStaatsangehoerigkeit) {
		if (newStaatsangehoerigkeit != staatsangehoerigkeit) {
			NotificationChain msgs = null;
			if (staatsangehoerigkeit != null)
				msgs = ((InternalEObject)staatsangehoerigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			if (newStaatsangehoerigkeit != null)
				msgs = ((InternalEObject)newStaatsangehoerigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			msgs = basicSetStaatsangehoerigkeit(newStaatsangehoerigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STAATSANGEHOERIGKEIT, newStaatsangehoerigkeit, newStaatsangehoerigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AufenthaltKindBasisType> getAufenthalt() {
		if (aufenthalt == null) {
			aufenthalt = new EObjectContainmentEList<AufenthaltKindBasisType>(AufenthaltKindBasisType.class, this, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AUFENTHALT);
		}
		return aufenthalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VertretungType> getVertretung() {
		if (vertretung == null) {
			vertretung = new EObjectContainmentEList<VertretungType>(VertretungType.class, this, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__VERTRETUNG);
		}
		return vertretung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EinkuenfteKindType> getEinkuenfte() {
		if (einkuenfte == null) {
			einkuenfte = new EObjectContainmentEList<EinkuenfteKindType>(EinkuenfteKindType.class, this, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__EINKUENFTE);
		}
		return einkuenfte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SonstigeLeistungKindType> getSonstigeLeistung() {
		if (sonstigeLeistung == null) {
			sonstigeLeistung = new EObjectContainmentEList<SonstigeLeistungKindType>(SonstigeLeistungKindType.class, this, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SONSTIGE_LEISTUNG);
		}
		return sonstigeLeistung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType getAnderePersonVerstorben() {
		return anderePersonVerstorben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnderePersonVerstorben(TatsacheMitNachweisType newAnderePersonVerstorben, NotificationChain msgs) {
		TatsacheMitNachweisType oldAnderePersonVerstorben = anderePersonVerstorben;
		anderePersonVerstorben = newAnderePersonVerstorben;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__ANDERE_PERSON_VERSTORBEN, oldAnderePersonVerstorben, newAnderePersonVerstorben);
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
	public void setAnderePersonVerstorben(TatsacheMitNachweisType newAnderePersonVerstorben) {
		if (newAnderePersonVerstorben != anderePersonVerstorben) {
			NotificationChain msgs = null;
			if (anderePersonVerstorben != null)
				msgs = ((InternalEObject)anderePersonVerstorben).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__ANDERE_PERSON_VERSTORBEN, null, msgs);
			if (newAnderePersonVerstorben != null)
				msgs = ((InternalEObject)newAnderePersonVerstorben).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__ANDERE_PERSON_VERSTORBEN, null, msgs);
			msgs = basicSetAnderePersonVerstorben(newAnderePersonVerstorben, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__ANDERE_PERSON_VERSTORBEN, newAnderePersonVerstorben, newAnderePersonVerstorben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitFreitextType getMitbetreuungDurchAnderenElternteil() {
		return mitbetreuungDurchAnderenElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMitbetreuungDurchAnderenElternteil(TatsacheMitFreitextType newMitbetreuungDurchAnderenElternteil, NotificationChain msgs) {
		TatsacheMitFreitextType oldMitbetreuungDurchAnderenElternteil = mitbetreuungDurchAnderenElternteil;
		mitbetreuungDurchAnderenElternteil = newMitbetreuungDurchAnderenElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL, oldMitbetreuungDurchAnderenElternteil, newMitbetreuungDurchAnderenElternteil);
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
	public void setMitbetreuungDurchAnderenElternteil(TatsacheMitFreitextType newMitbetreuungDurchAnderenElternteil) {
		if (newMitbetreuungDurchAnderenElternteil != mitbetreuungDurchAnderenElternteil) {
			NotificationChain msgs = null;
			if (mitbetreuungDurchAnderenElternteil != null)
				msgs = ((InternalEObject)mitbetreuungDurchAnderenElternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL, null, msgs);
			if (newMitbetreuungDurchAnderenElternteil != null)
				msgs = ((InternalEObject)newMitbetreuungDurchAnderenElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL, null, msgs);
			msgs = basicSetMitbetreuungDurchAnderenElternteil(newMitbetreuungDurchAnderenElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL, newMitbetreuungDurchAnderenElternteil, newMitbetreuungDurchAnderenElternteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchuleType getSchule() {
		return schule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchule(SchuleType newSchule, NotificationChain msgs) {
		SchuleType oldSchule = schule;
		schule = newSchule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SCHULE, oldSchule, newSchule);
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
	public void setSchule(SchuleType newSchule) {
		if (newSchule != schule) {
			NotificationChain msgs = null;
			if (schule != null)
				msgs = ((InternalEObject)schule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SCHULE, null, msgs);
			if (newSchule != null)
				msgs = ((InternalEObject)newSchule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SCHULE, null, msgs);
			msgs = basicSetSchule(newSchule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SCHULE, newSchule, newSchule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType getStudium() {
		return studium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudium(TatsacheMitNachweisType newStudium, NotificationChain msgs) {
		TatsacheMitNachweisType oldStudium = studium;
		studium = newStudium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STUDIUM, oldStudium, newStudium);
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
	public void setStudium(TatsacheMitNachweisType newStudium) {
		if (newStudium != studium) {
			NotificationChain msgs = null;
			if (studium != null)
				msgs = ((InternalEObject)studium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STUDIUM, null, msgs);
			if (newStudium != null)
				msgs = ((InternalEObject)newStudium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STUDIUM, null, msgs);
			msgs = basicSetStudium(newStudium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STUDIUM, newStudium, newStudium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGeschlechtType getGeschlecht() {
		return geschlecht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeschlecht(CodeGeschlechtType newGeschlecht, NotificationChain msgs) {
		CodeGeschlechtType oldGeschlecht = geschlecht;
		geschlecht = newGeschlecht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GESCHLECHT, oldGeschlecht, newGeschlecht);
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
	public void setGeschlecht(CodeGeschlechtType newGeschlecht) {
		if (newGeschlecht != geschlecht) {
			NotificationChain msgs = null;
			if (geschlecht != null)
				msgs = ((InternalEObject)geschlecht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GESCHLECHT, null, msgs);
			if (newGeschlecht != null)
				msgs = ((InternalEObject)newGeschlecht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GESCHLECHT, null, msgs);
			msgs = basicSetGeschlecht(newGeschlecht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GESCHLECHT, newGeschlecht, newGeschlecht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktenzeichen() {
		return aktenzeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktenzeichen(String newAktenzeichen) {
		String oldAktenzeichen = aktenzeichen;
		aktenzeichen = newAktenzeichen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AKTENZEICHEN, oldAktenzeichen, aktenzeichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__NAME:
				return basicSetName(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				return basicSetStaatsangehoerigkeit(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AUFENTHALT:
				return ((InternalEList<?>)getAufenthalt()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__VERTRETUNG:
				return ((InternalEList<?>)getVertretung()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__EINKUENFTE:
				return ((InternalEList<?>)getEinkuenfte()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SONSTIGE_LEISTUNG:
				return ((InternalEList<?>)getSonstigeLeistung()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__ANDERE_PERSON_VERSTORBEN:
				return basicSetAnderePersonVerstorben(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL:
				return basicSetMitbetreuungDurchAnderenElternteil(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SCHULE:
				return basicSetSchule(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STUDIUM:
				return basicSetStudium(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GESCHLECHT:
				return basicSetGeschlecht(null, msgs);
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
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__NAME:
				return getName();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURT:
				return getGeburt();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURTSURKUNDE:
				return getGeburtsurkunde();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AUFENTHALTSTITEL:
				return getAufenthaltstitel();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				return getStaatsangehoerigkeit();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AUFENTHALT:
				return getAufenthalt();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__VERTRETUNG:
				return getVertretung();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__EINKUENFTE:
				return getEinkuenfte();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SONSTIGE_LEISTUNG:
				return getSonstigeLeistung();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__ANDERE_PERSON_VERSTORBEN:
				return getAnderePersonVerstorben();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL:
				return getMitbetreuungDurchAnderenElternteil();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SCHULE:
				return getSchule();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STUDIUM:
				return getStudium();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GESCHLECHT:
				return getGeschlecht();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AKTENZEICHEN:
				return getAktenzeichen();
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
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__NAME:
				setName((NameOptionalType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURT:
				setGeburt((GeburtGeburtsortOptionalType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURTSURKUNDE:
				getGeburtsurkunde().clear();
				getGeburtsurkunde().addAll((Collection<? extends String>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AUFENTHALTSTITEL:
				getAufenthaltstitel().clear();
				getAufenthaltstitel().addAll((Collection<? extends String>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((StaatsangehoerigkeitType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AUFENTHALT:
				getAufenthalt().clear();
				getAufenthalt().addAll((Collection<? extends AufenthaltKindBasisType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__VERTRETUNG:
				getVertretung().clear();
				getVertretung().addAll((Collection<? extends VertretungType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__EINKUENFTE:
				getEinkuenfte().clear();
				getEinkuenfte().addAll((Collection<? extends EinkuenfteKindType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SONSTIGE_LEISTUNG:
				getSonstigeLeistung().clear();
				getSonstigeLeistung().addAll((Collection<? extends SonstigeLeistungKindType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__ANDERE_PERSON_VERSTORBEN:
				setAnderePersonVerstorben((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL:
				setMitbetreuungDurchAnderenElternteil((TatsacheMitFreitextType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SCHULE:
				setSchule((SchuleType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STUDIUM:
				setStudium((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AKTENZEICHEN:
				setAktenzeichen((String)newValue);
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
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__NAME:
				setName((NameOptionalType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURT:
				setGeburt((GeburtGeburtsortOptionalType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURTSURKUNDE:
				getGeburtsurkunde().clear();
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AUFENTHALTSTITEL:
				getAufenthaltstitel().clear();
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((StaatsangehoerigkeitType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AUFENTHALT:
				getAufenthalt().clear();
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__VERTRETUNG:
				getVertretung().clear();
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__EINKUENFTE:
				getEinkuenfte().clear();
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SONSTIGE_LEISTUNG:
				getSonstigeLeistung().clear();
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__ANDERE_PERSON_VERSTORBEN:
				setAnderePersonVerstorben((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL:
				setMitbetreuungDurchAnderenElternteil((TatsacheMitFreitextType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SCHULE:
				setSchule((SchuleType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STUDIUM:
				setStudium((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AKTENZEICHEN:
				setAktenzeichen(AKTENZEICHEN_EDEFAULT);
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
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__NAME:
				return name != null;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURT:
				return geburt != null;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GEBURTSURKUNDE:
				return geburtsurkunde != null && !geburtsurkunde.isEmpty();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AUFENTHALTSTITEL:
				return aufenthaltstitel != null && !aufenthaltstitel.isEmpty();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				return staatsangehoerigkeit != null;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AUFENTHALT:
				return aufenthalt != null && !aufenthalt.isEmpty();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__VERTRETUNG:
				return vertretung != null && !vertretung.isEmpty();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__EINKUENFTE:
				return einkuenfte != null && !einkuenfte.isEmpty();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SONSTIGE_LEISTUNG:
				return sonstigeLeistung != null && !sonstigeLeistung.isEmpty();
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__ANDERE_PERSON_VERSTORBEN:
				return anderePersonVerstorben != null;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL:
				return mitbetreuungDurchAnderenElternteil != null;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__SCHULE:
				return schule != null;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__STUDIUM:
				return studium != null;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__GESCHLECHT:
				return geschlecht != null;
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE__AKTENZEICHEN:
				return AKTENZEICHEN_EDEFAULT == null ? aktenzeichen != null : !AKTENZEICHEN_EDEFAULT.equals(aktenzeichen);
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
		result.append(" (geburtsurkunde: ");
		result.append(geburtsurkunde);
		result.append(", aufenthaltstitel: ");
		result.append(aufenthaltstitel);
		result.append(", aktenzeichen: ");
		result.append(aktenzeichen);
		result.append(')');
		return result.toString();
	}

} //AntragskindBasisTypeImpl
