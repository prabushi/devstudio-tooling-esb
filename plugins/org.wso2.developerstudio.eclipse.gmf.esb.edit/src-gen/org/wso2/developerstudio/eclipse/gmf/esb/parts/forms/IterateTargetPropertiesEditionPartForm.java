/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.wso2.developerstudio.eclipse.gmf.esb.parts.EsbViewsRepository;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart;

import org.wso2.developerstudio.eclipse.gmf.esb.providers.EsbMessages;

// End of user code

/**
 * 
 * 
 */
public class IterateTargetPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, IterateTargetPropertiesEditionPart {

	protected EMFComboViewer sequenceType;
	protected EObjectFlatComboViewer sequence;
	protected EMFComboViewer endpointType;
	protected Text soapAction;
	protected Text toAddress;



	/**
	 * For {@link ISection} use only.
	 */
	public IterateTargetPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IterateTargetPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence iterateTargetStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = iterateTargetStep.addStep(EsbViewsRepository.IterateTarget.Properties.class);
		propertiesStep.addStep(EsbViewsRepository.IterateTarget.Properties.sequenceType);
		propertiesStep.addStep(EsbViewsRepository.IterateTarget.Properties.sequence);
		propertiesStep.addStep(EsbViewsRepository.IterateTarget.Properties.endpointType);
		propertiesStep.addStep(EsbViewsRepository.IterateTarget.Properties.soapAction);
		propertiesStep.addStep(EsbViewsRepository.IterateTarget.Properties.toAddress);
		
		
		composer = new PartComposer(iterateTargetStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EsbViewsRepository.IterateTarget.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.IterateTarget.Properties.sequenceType) {
					return createSequenceTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.IterateTarget.Properties.sequence) {
					return createSequenceFlatComboViewer(parent, widgetFactory);
				}
				if (key == EsbViewsRepository.IterateTarget.Properties.endpointType) {
					return createEndpointTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.IterateTarget.Properties.soapAction) {
					return createSoapActionText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.IterateTarget.Properties.toAddress) {
					return createToAddressText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EsbMessages.IterateTargetPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @generated NOT
	 */
	protected Composite createSequenceTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.IterateTarget.Properties.sequenceType, EsbMessages.IterateTargetPropertiesEditionPart_SequenceTypeLabel);
		sequenceType = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		sequenceType.setContentProvider(new ArrayContentProvider());
		sequenceType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData sequenceTypeData = new GridData(GridData.FILL_HORIZONTAL);
		sequenceType.getCombo().setLayoutData(sequenceTypeData);
		sequenceType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IterateTargetPropertiesEditionPartForm.this, EsbViewsRepository.IterateTarget.Properties.sequenceType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSequenceType()));
			}

		});
		sequenceType.setID(EsbViewsRepository.IterateTarget.Properties.sequenceType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.IterateTarget.Properties.sequenceType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSequenceTypeEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSequenceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EsbViewsRepository.IterateTarget.Properties.sequence, EsbMessages.IterateTargetPropertiesEditionPart_SequenceLabel);
		sequence = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EsbViewsRepository.IterateTarget.Properties.sequence, EsbViewsRepository.FORM_KIND));
		widgetFactory.adapt(sequence);
		sequence.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData sequenceData = new GridData(GridData.FILL_HORIZONTAL);
		sequence.setLayoutData(sequenceData);
		sequence.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IterateTargetPropertiesEditionPartForm.this, EsbViewsRepository.IterateTarget.Properties.sequence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSequence()));
			}

		});
		sequence.setID(EsbViewsRepository.IterateTarget.Properties.sequence);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.IterateTarget.Properties.sequence, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSequenceFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated NOT
	 */
	protected Composite createEndpointTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.IterateTarget.Properties.endpointType, EsbMessages.IterateTargetPropertiesEditionPart_EndpointTypeLabel);
		endpointType = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		endpointType.setContentProvider(new ArrayContentProvider());
		endpointType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData endpointTypeData = new GridData(GridData.FILL_HORIZONTAL);
		endpointType.getCombo().setLayoutData(endpointTypeData);
		endpointType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IterateTargetPropertiesEditionPartForm.this, EsbViewsRepository.IterateTarget.Properties.endpointType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEndpointType()));
			}

		});
		endpointType.setID(EsbViewsRepository.IterateTarget.Properties.endpointType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.IterateTarget.Properties.endpointType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createEndpointTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createSoapActionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.IterateTarget.Properties.soapAction, EsbMessages.IterateTargetPropertiesEditionPart_SoapActionLabel);
		soapAction = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		soapAction.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData soapActionData = new GridData(GridData.FILL_HORIZONTAL);
		soapAction.setLayoutData(soapActionData);
		soapAction.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							IterateTargetPropertiesEditionPartForm.this,
							EsbViewsRepository.IterateTarget.Properties.soapAction,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, soapAction.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									IterateTargetPropertiesEditionPartForm.this,
									EsbViewsRepository.IterateTarget.Properties.soapAction,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, soapAction.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									IterateTargetPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		soapAction.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IterateTargetPropertiesEditionPartForm.this, EsbViewsRepository.IterateTarget.Properties.soapAction, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, soapAction.getText()));
				}
			}
		});
		EditingUtils.setID(soapAction, EsbViewsRepository.IterateTarget.Properties.soapAction);
		EditingUtils.setEEFtype(soapAction, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.IterateTarget.Properties.soapAction, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSoapActionText

		// End of user code
		return parent;
	}

	
	protected Composite createToAddressText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.IterateTarget.Properties.toAddress, EsbMessages.IterateTargetPropertiesEditionPart_ToAddressLabel);
		toAddress = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		toAddress.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData toAddressData = new GridData(GridData.FILL_HORIZONTAL);
		toAddress.setLayoutData(toAddressData);
		toAddress.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							IterateTargetPropertiesEditionPartForm.this,
							EsbViewsRepository.IterateTarget.Properties.toAddress,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, toAddress.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									IterateTargetPropertiesEditionPartForm.this,
									EsbViewsRepository.IterateTarget.Properties.toAddress,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, toAddress.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									IterateTargetPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		toAddress.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IterateTargetPropertiesEditionPartForm.this, EsbViewsRepository.IterateTarget.Properties.toAddress, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, toAddress.getText()));
				}
			}
		});
		EditingUtils.setID(toAddress, EsbViewsRepository.IterateTarget.Properties.toAddress);
		EditingUtils.setEEFtype(toAddress, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.IterateTarget.Properties.toAddress, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createToAddressText

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#getSequenceType()
	 * 
	 */
	public Enumerator getSequenceType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) sequenceType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#initSequenceType(Object input, Enumerator current)
	 */
	public void initSequenceType(Object input, Enumerator current) {
		sequenceType.setInput(input);
		sequenceType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.IterateTarget.Properties.sequenceType);
		if (eefElementEditorReadOnlyState && sequenceType.isEnabled()) {
			sequenceType.setEnabled(false);
			sequenceType.setToolTipText(EsbMessages.IterateTarget_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sequenceType.isEnabled()) {
			sequenceType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#setSequenceType(Enumerator newValue)
	 * 
	 */
	public void setSequenceType(Enumerator newValue) {
		sequenceType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.IterateTarget.Properties.sequenceType);
		if (eefElementEditorReadOnlyState && sequenceType.isEnabled()) {
			sequenceType.setEnabled(false);
			sequenceType.setToolTipText(EsbMessages.IterateTarget_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sequenceType.isEnabled()) {
			sequenceType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#getSequence()
	 * 
	 */
	public EObject getSequence() {
		if (sequence.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) sequence.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#initSequence(EObjectFlatComboSettings)
	 */
	public void initSequence(EObjectFlatComboSettings settings) {
		sequence.setInput(settings);
		if (current != null) {
			sequence.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.IterateTarget.Properties.sequence);
		if (eefElementEditorReadOnlyState && sequence.isEnabled()) {
			sequence.setEnabled(false);
			sequence.setToolTipText(EsbMessages.IterateTarget_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sequence.isEnabled()) {
			sequence.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#setSequence(EObject newValue)
	 * 
	 */
	public void setSequence(EObject newValue) {
		if (newValue != null) {
			sequence.setSelection(new StructuredSelection(newValue));
		} else {
			sequence.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.IterateTarget.Properties.sequence);
		if (eefElementEditorReadOnlyState && sequence.isEnabled()) {
			sequence.setEnabled(false);
			sequence.setToolTipText(EsbMessages.IterateTarget_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sequence.isEnabled()) {
			sequence.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#setSequenceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSequenceButtonMode(ButtonsModeEnum newValue) {
		sequence.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#addFilterSequence(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSequence(ViewerFilter filter) {
		sequence.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#addBusinessFilterSequence(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSequence(ViewerFilter filter) {
		sequence.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#getEndpointType()
	 * 
	 */
	public Enumerator getEndpointType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) endpointType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#initEndpointType(Object input, Enumerator current)
	 */
	public void initEndpointType(Object input, Enumerator current) {
		endpointType.setInput(input);
		endpointType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.IterateTarget.Properties.endpointType);
		if (eefElementEditorReadOnlyState && endpointType.isEnabled()) {
			endpointType.setEnabled(false);
			endpointType.setToolTipText(EsbMessages.IterateTarget_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endpointType.isEnabled()) {
			endpointType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#setEndpointType(Enumerator newValue)
	 * 
	 */
	public void setEndpointType(Enumerator newValue) {
		endpointType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.IterateTarget.Properties.endpointType);
		if (eefElementEditorReadOnlyState && endpointType.isEnabled()) {
			endpointType.setEnabled(false);
			endpointType.setToolTipText(EsbMessages.IterateTarget_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endpointType.isEnabled()) {
			endpointType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#getSoapAction()
	 * 
	 */
	public String getSoapAction() {
		return soapAction.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#setSoapAction(String newValue)
	 * 
	 */
	public void setSoapAction(String newValue) {
		if (newValue != null) {
			soapAction.setText(newValue);
		} else {
			soapAction.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.IterateTarget.Properties.soapAction);
		if (eefElementEditorReadOnlyState && soapAction.isEnabled()) {
			soapAction.setEnabled(false);
			soapAction.setToolTipText(EsbMessages.IterateTarget_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !soapAction.isEnabled()) {
			soapAction.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#getToAddress()
	 * 
	 */
	public String getToAddress() {
		return toAddress.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.IterateTargetPropertiesEditionPart#setToAddress(String newValue)
	 * 
	 */
	public void setToAddress(String newValue) {
		if (newValue != null) {
			toAddress.setText(newValue);
		} else {
			toAddress.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.IterateTarget.Properties.toAddress);
		if (eefElementEditorReadOnlyState && toAddress.isEnabled()) {
			toAddress.setEnabled(false);
			toAddress.setToolTipText(EsbMessages.IterateTarget_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toAddress.isEnabled()) {
			toAddress.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EsbMessages.IterateTarget_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
