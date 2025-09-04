/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.AnwendungsspezifischeErweiterungType;
import de.xoev.domea.domea.AnwendungsspezifischeErweiterungXMLType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.IdentifikationNachrichtType;
import de.xoev.domea.domea.KontaktType;
import de.xoev.domea.domea.NachrichtenkopfType;

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
 * An implementation of the model object '<em><b>Nachrichtenkopf Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtenkopfTypeImpl#getIdentifikationNachricht <em>Identifikation Nachricht</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtenkopfTypeImpl#getLeser <em>Leser</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtenkopfTypeImpl#getAutor <em>Autor</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtenkopfTypeImpl#getProzessID <em>Prozess ID</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtenkopfTypeImpl#getInstanzID <em>Instanz ID</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtenkopfTypeImpl#getHinweis <em>Hinweis</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtenkopfTypeImpl#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtenkopfTypeImpl#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachrichtenkopfTypeImpl extends MinimalEObjectImpl.Container implements NachrichtenkopfType {
	/**
	 * The cached value of the '{@link #getIdentifikationNachricht() <em>Identifikation Nachricht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifikationNachricht()
	 * @generated
	 * @ordered
	 */
	protected IdentifikationNachrichtType identifikationNachricht;

	/**
	 * The cached value of the '{@link #getLeser() <em>Leser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeser()
	 * @generated
	 * @ordered
	 */
	protected KontaktType leser;

	/**
	 * The cached value of the '{@link #getAutor() <em>Autor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected KontaktType autor;

	/**
	 * The default value of the '{@link #getProzessID() <em>Prozess ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProzessID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROZESS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProzessID() <em>Prozess ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProzessID()
	 * @generated
	 * @ordered
	 */
	protected String prozessID = PROZESS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanzID() <em>Instanz ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanzID()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANZ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanzID() <em>Instanz ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanzID()
	 * @generated
	 * @ordered
	 */
	protected String instanzID = INSTANZ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHinweis() <em>Hinweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHinweis()
	 * @generated
	 * @ordered
	 */
	protected static final String HINWEIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHinweis() <em>Hinweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHinweis()
	 * @generated
	 * @ordered
	 */
	protected String hinweis = HINWEIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnwendungsspezifischeErweiterung() <em>Anwendungsspezifische Erweiterung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungsspezifischeErweiterung()
	 * @generated
	 * @ordered
	 */
	protected EList<AnwendungsspezifischeErweiterungType> anwendungsspezifischeErweiterung;

	/**
	 * The cached value of the '{@link #getAnwendungsspezifischeErweiterungXML() <em>Anwendungsspezifische Erweiterung XML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungsspezifischeErweiterungXML()
	 * @generated
	 * @ordered
	 */
	protected AnwendungsspezifischeErweiterungXMLType anwendungsspezifischeErweiterungXML;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachrichtenkopfTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.NACHRICHTENKOPF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifikationNachrichtType getIdentifikationNachricht() {
		return identifikationNachricht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifikationNachricht(IdentifikationNachrichtType newIdentifikationNachricht, NotificationChain msgs) {
		IdentifikationNachrichtType oldIdentifikationNachricht = identifikationNachricht;
		identifikationNachricht = newIdentifikationNachricht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT, oldIdentifikationNachricht, newIdentifikationNachricht);
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
	public void setIdentifikationNachricht(IdentifikationNachrichtType newIdentifikationNachricht) {
		if (newIdentifikationNachricht != identifikationNachricht) {
			NotificationChain msgs = null;
			if (identifikationNachricht != null)
				msgs = ((InternalEObject)identifikationNachricht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT, null, msgs);
			if (newIdentifikationNachricht != null)
				msgs = ((InternalEObject)newIdentifikationNachricht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT, null, msgs);
			msgs = basicSetIdentifikationNachricht(newIdentifikationNachricht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT, newIdentifikationNachricht, newIdentifikationNachricht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KontaktType getLeser() {
		return leser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeser(KontaktType newLeser, NotificationChain msgs) {
		KontaktType oldLeser = leser;
		leser = newLeser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHTENKOPF_TYPE__LESER, oldLeser, newLeser);
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
	public void setLeser(KontaktType newLeser) {
		if (newLeser != leser) {
			NotificationChain msgs = null;
			if (leser != null)
				msgs = ((InternalEObject)leser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NACHRICHTENKOPF_TYPE__LESER, null, msgs);
			if (newLeser != null)
				msgs = ((InternalEObject)newLeser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NACHRICHTENKOPF_TYPE__LESER, null, msgs);
			msgs = basicSetLeser(newLeser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHTENKOPF_TYPE__LESER, newLeser, newLeser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KontaktType getAutor() {
		return autor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutor(KontaktType newAutor, NotificationChain msgs) {
		KontaktType oldAutor = autor;
		autor = newAutor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHTENKOPF_TYPE__AUTOR, oldAutor, newAutor);
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
	public void setAutor(KontaktType newAutor) {
		if (newAutor != autor) {
			NotificationChain msgs = null;
			if (autor != null)
				msgs = ((InternalEObject)autor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NACHRICHTENKOPF_TYPE__AUTOR, null, msgs);
			if (newAutor != null)
				msgs = ((InternalEObject)newAutor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NACHRICHTENKOPF_TYPE__AUTOR, null, msgs);
			msgs = basicSetAutor(newAutor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHTENKOPF_TYPE__AUTOR, newAutor, newAutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProzessID() {
		return prozessID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProzessID(String newProzessID) {
		String oldProzessID = prozessID;
		prozessID = newProzessID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHTENKOPF_TYPE__PROZESS_ID, oldProzessID, prozessID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanzID() {
		return instanzID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanzID(String newInstanzID) {
		String oldInstanzID = instanzID;
		instanzID = newInstanzID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHTENKOPF_TYPE__INSTANZ_ID, oldInstanzID, instanzID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHinweis() {
		return hinweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHinweis(String newHinweis) {
		String oldHinweis = hinweis;
		hinweis = newHinweis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHTENKOPF_TYPE__HINWEIS, oldHinweis, hinweis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnwendungsspezifischeErweiterungType> getAnwendungsspezifischeErweiterung() {
		if (anwendungsspezifischeErweiterung == null) {
			anwendungsspezifischeErweiterung = new EObjectContainmentEList<AnwendungsspezifischeErweiterungType>(AnwendungsspezifischeErweiterungType.class, this, DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG);
		}
		return anwendungsspezifischeErweiterung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnwendungsspezifischeErweiterungXMLType getAnwendungsspezifischeErweiterungXML() {
		return anwendungsspezifischeErweiterungXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType newAnwendungsspezifischeErweiterungXML, NotificationChain msgs) {
		AnwendungsspezifischeErweiterungXMLType oldAnwendungsspezifischeErweiterungXML = anwendungsspezifischeErweiterungXML;
		anwendungsspezifischeErweiterungXML = newAnwendungsspezifischeErweiterungXML;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, oldAnwendungsspezifischeErweiterungXML, newAnwendungsspezifischeErweiterungXML);
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
	public void setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType newAnwendungsspezifischeErweiterungXML) {
		if (newAnwendungsspezifischeErweiterungXML != anwendungsspezifischeErweiterungXML) {
			NotificationChain msgs = null;
			if (anwendungsspezifischeErweiterungXML != null)
				msgs = ((InternalEObject)anwendungsspezifischeErweiterungXML).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, null, msgs);
			if (newAnwendungsspezifischeErweiterungXML != null)
				msgs = ((InternalEObject)newAnwendungsspezifischeErweiterungXML).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, null, msgs);
			msgs = basicSetAnwendungsspezifischeErweiterungXML(newAnwendungsspezifischeErweiterungXML, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, newAnwendungsspezifischeErweiterungXML, newAnwendungsspezifischeErweiterungXML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT:
				return basicSetIdentifikationNachricht(null, msgs);
			case DomeaPackage.NACHRICHTENKOPF_TYPE__LESER:
				return basicSetLeser(null, msgs);
			case DomeaPackage.NACHRICHTENKOPF_TYPE__AUTOR:
				return basicSetAutor(null, msgs);
			case DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return ((InternalEList<?>)getAnwendungsspezifischeErweiterung()).basicRemove(otherEnd, msgs);
			case DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return basicSetAnwendungsspezifischeErweiterungXML(null, msgs);
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
			case DomeaPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT:
				return getIdentifikationNachricht();
			case DomeaPackage.NACHRICHTENKOPF_TYPE__LESER:
				return getLeser();
			case DomeaPackage.NACHRICHTENKOPF_TYPE__AUTOR:
				return getAutor();
			case DomeaPackage.NACHRICHTENKOPF_TYPE__PROZESS_ID:
				return getProzessID();
			case DomeaPackage.NACHRICHTENKOPF_TYPE__INSTANZ_ID:
				return getInstanzID();
			case DomeaPackage.NACHRICHTENKOPF_TYPE__HINWEIS:
				return getHinweis();
			case DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return getAnwendungsspezifischeErweiterung();
			case DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return getAnwendungsspezifischeErweiterungXML();
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
			case DomeaPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT:
				setIdentifikationNachricht((IdentifikationNachrichtType)newValue);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__LESER:
				setLeser((KontaktType)newValue);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__AUTOR:
				setAutor((KontaktType)newValue);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__PROZESS_ID:
				setProzessID((String)newValue);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__INSTANZ_ID:
				setInstanzID((String)newValue);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__HINWEIS:
				setHinweis((String)newValue);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				getAnwendungsspezifischeErweiterung().clear();
				getAnwendungsspezifischeErweiterung().addAll((Collection<? extends AnwendungsspezifischeErweiterungType>)newValue);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				setAnwendungsspezifischeErweiterungXML((AnwendungsspezifischeErweiterungXMLType)newValue);
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
			case DomeaPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT:
				setIdentifikationNachricht((IdentifikationNachrichtType)null);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__LESER:
				setLeser((KontaktType)null);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__AUTOR:
				setAutor((KontaktType)null);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__PROZESS_ID:
				setProzessID(PROZESS_ID_EDEFAULT);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__INSTANZ_ID:
				setInstanzID(INSTANZ_ID_EDEFAULT);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__HINWEIS:
				setHinweis(HINWEIS_EDEFAULT);
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				getAnwendungsspezifischeErweiterung().clear();
				return;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				setAnwendungsspezifischeErweiterungXML((AnwendungsspezifischeErweiterungXMLType)null);
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
			case DomeaPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT:
				return identifikationNachricht != null;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__LESER:
				return leser != null;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__AUTOR:
				return autor != null;
			case DomeaPackage.NACHRICHTENKOPF_TYPE__PROZESS_ID:
				return PROZESS_ID_EDEFAULT == null ? prozessID != null : !PROZESS_ID_EDEFAULT.equals(prozessID);
			case DomeaPackage.NACHRICHTENKOPF_TYPE__INSTANZ_ID:
				return INSTANZ_ID_EDEFAULT == null ? instanzID != null : !INSTANZ_ID_EDEFAULT.equals(instanzID);
			case DomeaPackage.NACHRICHTENKOPF_TYPE__HINWEIS:
				return HINWEIS_EDEFAULT == null ? hinweis != null : !HINWEIS_EDEFAULT.equals(hinweis);
			case DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return anwendungsspezifischeErweiterung != null && !anwendungsspezifischeErweiterung.isEmpty();
			case DomeaPackage.NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return anwendungsspezifischeErweiterungXML != null;
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
		result.append(" (prozessID: ");
		result.append(prozessID);
		result.append(", instanzID: ");
		result.append(instanzID);
		result.append(", hinweis: ");
		result.append(hinweis);
		result.append(')');
		return result.toString();
	}

} //NachrichtenkopfTypeImpl
