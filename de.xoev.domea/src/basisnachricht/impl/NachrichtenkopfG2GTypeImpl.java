/*
 */
package basisnachricht.impl;

import basisnachricht.BasisnachrichtPackage;
import basisnachricht.BehoerdeType;
import basisnachricht.IdentifikationNachrichtType;
import basisnachricht.NachrichtenkopfG2GType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachrichtenkopf G2G Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link basisnachricht.impl.NachrichtenkopfG2GTypeImpl#getIdentifikationNachricht <em>Identifikation Nachricht</em>}</li>
 *   <li>{@link basisnachricht.impl.NachrichtenkopfG2GTypeImpl#getLeser <em>Leser</em>}</li>
 *   <li>{@link basisnachricht.impl.NachrichtenkopfG2GTypeImpl#getAutor <em>Autor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachrichtenkopfG2GTypeImpl extends MinimalEObjectImpl.Container implements NachrichtenkopfG2GType {
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
	protected BehoerdeType leser;

	/**
	 * The cached value of the '{@link #getAutor() <em>Autor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected BehoerdeType autor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachrichtenkopfG2GTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisnachrichtPackage.Literals.NACHRICHTENKOPF_G2G_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT, oldIdentifikationNachricht, newIdentifikationNachricht);
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
				msgs = ((InternalEObject)identifikationNachricht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT, null, msgs);
			if (newIdentifikationNachricht != null)
				msgs = ((InternalEObject)newIdentifikationNachricht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT, null, msgs);
			msgs = basicSetIdentifikationNachricht(newIdentifikationNachricht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT, newIdentifikationNachricht, newIdentifikationNachricht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehoerdeType getLeser() {
		return leser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeser(BehoerdeType newLeser, NotificationChain msgs) {
		BehoerdeType oldLeser = leser;
		leser = newLeser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__LESER, oldLeser, newLeser);
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
	public void setLeser(BehoerdeType newLeser) {
		if (newLeser != leser) {
			NotificationChain msgs = null;
			if (leser != null)
				msgs = ((InternalEObject)leser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__LESER, null, msgs);
			if (newLeser != null)
				msgs = ((InternalEObject)newLeser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__LESER, null, msgs);
			msgs = basicSetLeser(newLeser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__LESER, newLeser, newLeser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehoerdeType getAutor() {
		return autor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutor(BehoerdeType newAutor, NotificationChain msgs) {
		BehoerdeType oldAutor = autor;
		autor = newAutor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__AUTOR, oldAutor, newAutor);
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
	public void setAutor(BehoerdeType newAutor) {
		if (newAutor != autor) {
			NotificationChain msgs = null;
			if (autor != null)
				msgs = ((InternalEObject)autor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__AUTOR, null, msgs);
			if (newAutor != null)
				msgs = ((InternalEObject)newAutor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__AUTOR, null, msgs);
			msgs = basicSetAutor(newAutor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__AUTOR, newAutor, newAutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT:
				return basicSetIdentifikationNachricht(null, msgs);
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__LESER:
				return basicSetLeser(null, msgs);
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__AUTOR:
				return basicSetAutor(null, msgs);
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
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT:
				return getIdentifikationNachricht();
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__LESER:
				return getLeser();
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__AUTOR:
				return getAutor();
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
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT:
				setIdentifikationNachricht((IdentifikationNachrichtType)newValue);
				return;
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__LESER:
				setLeser((BehoerdeType)newValue);
				return;
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__AUTOR:
				setAutor((BehoerdeType)newValue);
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
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT:
				setIdentifikationNachricht((IdentifikationNachrichtType)null);
				return;
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__LESER:
				setLeser((BehoerdeType)null);
				return;
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__AUTOR:
				setAutor((BehoerdeType)null);
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
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT:
				return identifikationNachricht != null;
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__LESER:
				return leser != null;
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE__AUTOR:
				return autor != null;
		}
		return super.eIsSet(featureID);
	}

} //NachrichtenkopfG2GTypeImpl
